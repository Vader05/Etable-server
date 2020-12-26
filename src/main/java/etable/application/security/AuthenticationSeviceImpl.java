package etable.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etable.domain.security.model.Authentication;
import etable.domain.security.repository.AuthenticationRepository;

@Service
public class AuthenticationSeviceImpl implements AuthenticationService{

	@Autowired
	private AuthenticationRepository repository;
	
	public Authentication buscarUsuarioSiExiste(String nickname) {
		return this.repository.buscarUsuarioSiExiste(nickname);
	}

	@Override
	public Authentication authenticationLogin(Authentication auth) {
		return this.repository.authenticationLogin(auth);
	}

}
