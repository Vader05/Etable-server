package etable.web.controllers;

import java.util.LinkedHashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.user.UserService;
import etable.domain.cliente.model.Cliente;
import etable.domain.cliente.model.ClienteDTO;
import etable.domain.user.model.User;
import etable.domain.user.model.UserDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/user"})
public class UsuarioController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService service;
	
	@PostMapping(path = {"/crearUsuario"})
	public User crearUsuario(@RequestBody User user) {
		return this.service.crearNuevoUsuario(user);
	}
	
	@PostMapping(path = {"/crearCliente"})
	public Cliente crearCliente(@RequestBody JSONObject obj) {
		@SuppressWarnings("unchecked")LinkedHashMap<Object, Object> u = (LinkedHashMap<Object, Object>) obj.get("user");
		@SuppressWarnings("unchecked")LinkedHashMap<Object, Object> c = (LinkedHashMap<Object, Object>) obj.get("cliente");
		User user = new User(0, (String) u.get("nickname"), (String)u.get("password"), (String)u.get("usnombres"), (String)u.get("usapellidos"), true, (int)u.get("ctipousuario"));
		Cliente cliente = new Cliente(0, Integer.parseInt(c.get("dni").toString()), 0, (String) c.get("email"), (String)c.get("phone"), (String)c.get("date"));
		return this.service.crearCliente(user, cliente);
	}
	
	@PostMapping(path = {"/obtenerUsuario"})
	public User obtenerUsuarioPorAutenticacion(@RequestBody User user) {
		return this.service.getUsuarioByAuthentication(user);
	}
	
	@GetMapping(path= {"/obtenerUsuarios"})
	public List<UserDTO> listUsuarios() {
		return this.service.getUsuarios();
	}

	@GetMapping(path= {"/obtenerUsuario/{id}"})
	public User obtenerUsuarioById(@PathVariable int id) {
		return this.service.getUsuarioById(id);
	}
	
	@PutMapping(path = {"/editarUsuario"})
	public User editarUsuarioById(@RequestBody User user) {
		return this.service.actualizarUsuario(user);
	}
	
	@DeleteMapping(path = {"/eliminarUsuario/{id}"})
	public boolean deleteUserById(@PathVariable int id) {
		return this.service.deleteUser(id);
	}
	
	@PutMapping(path = {"/editarCliente"})
	public Cliente editCliente(@RequestBody Cliente cliente){
		return this.service.actualizarCliente(cliente);
	}
	
	@GetMapping(path = {"/clientes"})
	public List<ClienteDTO> listClientes() {
		return this.service.getClientes();
	}
	
	@GetMapping(path = {"/clientes/{id}"})
	public Cliente getClienteByUserId(@PathVariable int id) {
		return this.service.getClienteByUserId(id);
	}
	
	@GetMapping(path = {"/clientes/obtenerCliente/{id}"})
	public ClienteDTO getClienteById(@PathVariable int id) {
		return this.service.getClienteById(id);
	}
	
	@DeleteMapping(path = {"/clientes/deleteCliente/{id}"})
	public boolean deleteClienteById(@PathVariable int id) {
		log.info("borrando usuario con id: {}",id);
		return this.service.eliminarClienteById(id);
	}
}
