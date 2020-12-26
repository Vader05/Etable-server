package etable.infrastructure.security.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import etable.domain.security.model.Authentication;
import etable.domain.security.repository.AuthenticationRepository;


@Component
public class AuthenticationRepositoryImpl implements AuthenticationRepository{

	private final JdbcTemplate jdbcTemplate;
	private final AuthenticationRowMapper row;
	
	private final PasswordEncoder passwordEncoder;
	
	public AuthenticationRepositoryImpl(JdbcTemplate jdbcTemplate, AuthenticationRowMapper row, PasswordEncoder passwordEncoder) {
		this.jdbcTemplate = jdbcTemplate;
		this.row = row;
		this.passwordEncoder = passwordEncoder;
	}
	
	
	public Authentication buscarUsuarioSiExiste(String nickname) {
		Authentication auth = new Authentication();
		String query = "SELECT * FROM TBUSUARIOS WHERE NICKNAME = ?";
		List<Authentication> authentication;
		List<Map<String, Object>> rows =  jdbcTemplate.queryForList(query, nickname);
		authentication = row.mapRow(rows);
		if(!authentication.isEmpty()) {
			auth.setCusuario(authentication.get(0).getCusuario());
			auth.setNickname(authentication.get(0).getNickname());
			auth.setCtipousuario(authentication.get(0).getCtipousuario());
			return auth;
		}
		return null;
	}
	
	
	@Override
	public Authentication authenticationLogin(Authentication auth) {
		String query = "SELECT * FROM TBUSUARIOS WHERE NICKNAME = ?";
		List<Authentication> authentication;
		List<Map<String, Object>> rows =  jdbcTemplate.queryForList(query, auth.getNickname());
		authentication = row.mapRow(rows);
		if(!authentication.isEmpty()) {
			String nickname_real = authentication.get(0).getNickname();
			String nickname_auth = auth.getNickname();
			String password_auth = auth.getPassword();
			if(nickname_auth.equalsIgnoreCase(nickname_real)) {
				boolean isPasswordMatches=this.passwordEncoder.matches(password_auth, authentication.get(0).getPassword());
				if(isPasswordMatches) {
					auth.setCusuario(authentication.get(0).getCusuario());
					auth.setNickname(authentication.get(0).getNickname());
					auth.setPassword(authentication.get(0).getPassword());
					auth.setEstado(authentication.get(0).isEstado());
					return auth;
				}else {
					return null;
				}
			} else {
				return null;
			}
		}
		return null;
	}

}
