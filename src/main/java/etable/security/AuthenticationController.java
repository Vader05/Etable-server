package etable.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.security.AuthenticationService;
import etable.domain.security.model.Authentication;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/api/authentication"})
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService service;
	
	
	@GetMapping(path = {"/finduserbynickname/{nickname:.+}"})
	public Authentication buscarUsuarioSiExiste(@PathVariable String nickname) {
		return this.service.buscarUsuarioSiExiste(nickname);
	}
	
	
	@PostMapping(path = {"/authenticationLogin"})
	public Authentication authenticationLogin(@RequestBody Authentication auth) {
		return this.service.authenticationLogin(auth);
	}
}
