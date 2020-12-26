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

import etable.application.mesa.MesaService;
import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.MesaDTO;
@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/mainMesa"})
public class MesaController {

	@Autowired
	private MesaService service;
	
	@GetMapping(path = {"/listMesas"})
	public List<MesaDTO> listMesas() {
		return this.service.getMesas();
	}
	
	@PutMapping(path = {"/actualizarMesaById/{id}"})
	public Mesa actualizarMesaById(@RequestBody Mesa mesa, @PathVariable int id) {
		mesa.setCmesa(id);		
		return this.service.actualizarMesaById(mesa, id);
	}

	@DeleteMapping(path = {"/eliminarMesaById/{id}"})
	public boolean eliminarMesaById( @PathVariable int id) {	
			return this.service.eliminarMesaById(id);
	}
	
	@PostMapping(path = {"/crearMesa"})
	public Mesa crearMesa(@RequestBody Mesa mesa) {
		return this.service.crearMesa(mesa) ;
	}
	@GetMapping(path= {"/obtenerMesa/{id}"})
	public Mesa getMesaById(@PathVariable int id) {
		return this.service.getMesaById(id);
	}

}
