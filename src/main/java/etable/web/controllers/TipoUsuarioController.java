package etable.web.controllers;

import java.util.List;

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

import etable.application.tipousuario.TipoUsuarioService;
import etable.domain.tipousuario.model.TipoUsuario;
import etable.domain.tipousuario.model.TipoUsuarioPermiso;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/usuarios"})
public class TipoUsuarioController {
	
	@Autowired
	private TipoUsuarioService service;
	
	//Tipo Usuario
	@GetMapping(path = {"/tipoUsuario/list"})
	public List<TipoUsuario> getTiposUsuario() {
		return this.service.getTiposUsuario();
	}
	
	@GetMapping(path = {"/tipoUsuario/{id}"})
	public TipoUsuario getTipoUsuarioById(@PathVariable int id) {
		return this.service.getTipoUsuarioById(id);
	}
	
	@PostMapping(path = {"/tipoUsuario/agregarTipoUsuario"})
	public TipoUsuario addTipoUsuario(@RequestBody TipoUsuario tipousuario) {
		return this.service.crearTipoUsuario(tipousuario);
	}
	
	@PutMapping(path = {"/tipoUsuario/editarTipoUsuario"})
	public TipoUsuario editTipoUsuario(@RequestBody TipoUsuario tipousuario) {
		return this.service.editTipoUsuario(tipousuario);
	}
	
	//Tipo Usuario y Permisos
	@GetMapping(path = {"/tipoUsuarioPermiso/{id}"})
	public List<TipoUsuarioPermiso> getPermisosAsignados(@PathVariable int id){
		return this.service.getPermisosAsignadosDeTipoUsuario(id);
	}
	
	@PostMapping(path = {"/tipoUsuarioPermiso/removerPermisos"})
	public boolean  removerPermisos(@RequestBody List<TipoUsuarioPermiso> list) {
		return this.service.removerPermisos(list);
	}
	
	@PostMapping(path = {"/tipoUsuarioPermiso/asignarPermisos"})
	public boolean asignarPermisosParaTipoUsuario(@RequestBody List<TipoUsuarioPermiso> tipouspermisos) {
		return this.service.asignarPermisosParaTipoUsuario(tipouspermisos);
	}
	
	
	@DeleteMapping(path = {"/tipoUsuario/eliminarTipoUsuario/{id}"})
	public boolean eliminarTipoUsuario(@PathVariable int id) {
		return this.service.eliminarTipoUsuarioById(id);
	}
}
