package etable.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.configuracion.ConfiguracionService;
import etable.domain.configuracion.model.Configuracion;
import etable.domain.configuracion.model.Image;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/configuracion"})
public class ConfiguracionController {

	@Autowired
	private ConfiguracionService service;
	
	@GetMapping(path = {"/configuracionSistema"})
	public Configuracion getConfiguracionSistemaGeneral() {
		return this.service.getConfiguracion();
	}
	
	@PutMapping(path = {"/actualizarConfiguracion/{id}"})
	public Configuracion actualizarConfiguracionSistemaGeneral(@RequestBody Configuracion configuracion, @PathVariable int id) {
		Image image = new Image(configuracion.getImageByte(), configuracion.getImageName());
		configuracion.setCconfiguracion(id);
		return this.service.actualizarConfiguracion(configuracion, image);
	}
	
	@PostMapping(path = {"/actualizarParametros/{id}"})
	public Configuracion actualizarParametros(@RequestBody Configuracion configuracion, @PathVariable int id) {
		configuracion.setCconfiguracion(id);
		return this.service.actualizarParametrosById(configuracion);
	}
	
	@GetMapping(path = {"/configuracionParametros"})
	public Configuracion getConfiguracionParametros() {
		return this.service.getParametros();
	}
}
