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

import etable.application.mesa.PerfilMesaService;
import etable.domain.mesa.model.PerfilMesa;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/perfilMesa"})
public class PerfilMesaController {

	@Autowired
	private PerfilMesaService service;
	
	@GetMapping(path = {"/listPerfilMesas"})
	public List<PerfilMesa> getPerfilMesas() {
		return this.service.getPerfilMesas();
	}
	
	@PutMapping(path = {"/actualizarPerfilMesaById/{id}"})
	public PerfilMesa actualizarMesaById(@RequestBody PerfilMesa perfilmesa, @PathVariable int id) {
		perfilmesa.setCperfilmesa(id);
		return this.service.actualizarPerfilMesaById(perfilmesa, id);
	}

	@DeleteMapping(path = {"/eliminarPerfilMesaById/{id}"})
	public boolean eliminarPerfilMesaById( @PathVariable int id) {	
			return this.service.eliminarPerfilMesaById(id);
	}
	
	@PostMapping(path = {"/crearPerfilMesa"})
	public PerfilMesa crearPerfilMesa(@RequestBody PerfilMesa mesa) {
		return this.service.crearPerfilMesa(mesa) ;
	}
	
	@GetMapping(path= {"/obtenerPerfilMesa/{id}"})
	public PerfilMesa obtenerPerfilMesa(@PathVariable int id) {
		return this.service.getPerfilMesaById(id);
	}

}
