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

/**
 * 
 * @author Kevin Rodrigo
 *
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/api/configuracion"})
public class ConfiguracionController {

	@Autowired
	private ConfiguracionService service;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(path = {"/configuracionSistema"})
	public Configuracion getConfiguracionSistemaGeneral() {
		return this.service.getConfiguracion();
	}
	
	/**
	 * 
	 * @param configuracion
	 * @param id
	 * @return
	 */
	@PutMapping(path = {"/actualizarConfiguracion/{id}"})
	public Configuracion actualizarConfiguracionSistemaGeneral(@RequestBody Configuracion configuracion, @PathVariable int id) {
		Image image = new Image(configuracion.getImageByte(), configuracion.getImageName());
		configuracion.setCconfiguracion(id);
		return this.service.actualizarConfiguracion(configuracion, image);
	}
	
	/**
	 * 
	 * @param configuracion
	 * @param id
	 * @return
	 */
	@PostMapping(path = {"/actualizarParametros/{id}"})
	public Configuracion actualizarParametros(@RequestBody Configuracion configuracion, @PathVariable int id) {
		configuracion.setCconfiguracion(id);
		return this.service.actualizarParametrosById(configuracion);
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(path = {"/configuracionParametros"})
	public Configuracion getConfiguracionParametros() {
		return this.service.getParametros();
	}
}
