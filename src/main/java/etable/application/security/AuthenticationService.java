package etable.application.security;

import etable.domain.security.model.Authentication;

public interface AuthenticationService {

	Authentication buscarUsuarioSiExiste(String nickname);
	Authentication authenticationLogin(Authentication auth);
}
