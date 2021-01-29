package etable;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.security.AuthenticationSeviceImpl;
import etable.application.user.UserServiceImpl;
import etable.domain.security.model.Authentication;
import etable.domain.user.model.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SecurityTest {
	
	@Autowired
	private AuthenticationSeviceImpl autenticacionservice;
	
	@Autowired
	private UserServiceImpl userservice;
	
	@Test
	public void comprobarAutenticacionVacio() {
		Authentication auth= autenticacionservice.buscarUsuarioSiExiste(" ");
		Assertions.assertThat(auth).isNull();
	}
	
	@Test
	public void comprobarAutenticacionExiste() {
		User user = userservice.getUsuarioById(1);
		Authentication auth= autenticacionservice.buscarUsuarioSiExiste(user.getNickname());
		Assertions.assertThat(auth).isNotNull();
		
	}

}
