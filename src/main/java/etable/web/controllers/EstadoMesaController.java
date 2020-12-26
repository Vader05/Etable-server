package etable.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.mesa.EstadoMesaService;
import etable.domain.mesa.model.EstadoMesa;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/estadoMesa"})
public class EstadoMesaController {

	@Autowired
	private EstadoMesaService service;
	
	@GetMapping(path = {"/listEstadoMesas"})
	public List<EstadoMesa> getEstadoMesas() {
		return this.service.getEstadoMesas();
	}
	
	@GetMapping(path= {"/obtenerEstadoMesa/{id}"})
	public EstadoMesa obtenerPerfilMesa(@PathVariable int id) {
		return this.service.getEstadoMesaById(id);
	}

}
