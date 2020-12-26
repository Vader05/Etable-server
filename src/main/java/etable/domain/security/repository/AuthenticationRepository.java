package etable.domain.security.repository;

import etable.domain.security.model.Authentication;

public interface AuthenticationRepository {
	Authentication buscarUsuarioSiExiste(String nickname);
	Authentication authenticationLogin(Authentication auth);
	
}
