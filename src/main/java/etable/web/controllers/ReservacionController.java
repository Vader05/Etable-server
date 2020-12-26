package etable.web.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etable.application.reservacion.ReservacionService;
import etable.domain.cliente.model.Cliente;
import etable.domain.reservacion.model.Reservacion;
import etable.domain.reservacion.model.ReservacionDTO;
import etable.domain.reservacion.model.ReservacionDTOCli;
@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/reservacion"})
public class ReservacionController {

	@Autowired
	private ReservacionService service;

	@PostMapping(path = {"/crearReservacion"})
	public Reservacion crearMesa(@RequestBody Reservacion reservacion) {
		return this.service.crearReservacion(reservacion);
	}

	@GetMapping(path= {"/obtenerClientebyUsuario/{id}"})
	public Cliente obtenerClientebyUsuario(@PathVariable int id) {
		return this.service.obtenerClientebyUsuario(id);
	}
	
	
	@GetMapping(path = {"/listReservacionesbyId/{id}"})
	public List<Reservacion> listReservacionesbyId( @PathVariable int id) {	
			return this.service.listReservacionesbyId(id);
	}
	@GetMapping(path = {"/listReservacionesDTObyId/{id}"})
	public List<ReservacionDTO> listReservacionesDTObyId( @PathVariable int id) {	
			return this.service.listReservacionesbyIdDTO(id);
	}

	@PutMapping(path = {"/anularReservacionById/{id}"})
	public boolean anularReservacionById( @PathVariable int id) {
		
		return this.service.anularReservacion(id);
	}
	@PutMapping(path = {"/revisarReservacionById/{id}"})
	public boolean revisarReservacion( @PathVariable int id) {
		
		return this.service.revisarReservacion(id);
	}
	@GetMapping(path = {"/listReservacionesDTO"})
	public List<ReservacionDTOCli> listReservacionesDTO() {	
			return this.service.listReservacionesDTO();
	}
	
}
