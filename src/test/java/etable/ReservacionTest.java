package etable;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.reservacion.ReservacionServiceImpl;
import etable.domain.cliente.model.Cliente;
import etable.domain.reservacion.model.Reservacion;
import etable.domain.reservacion.model.ReservacionDTOCli;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReservacionTest {
	
	@Autowired
	private ReservacionServiceImpl reservacionservice;
	
	@Test
	public void comprobarListarReservacion() {
		List<ReservacionDTOCli> reservaciones = reservacionservice.listReservacionesDTO();
		Assertions.assertThat(reservaciones.size()>=0).isTrue();
	}
	
	@Test
	public void comprobarReservacionesPorCliente(){
		List<Reservacion> reservacionesCli= reservacionservice.listReservacionesbyId(1);
		Assertions.assertThat(reservacionesCli.size()>=0).isTrue();
	}
	
	@Test
	public void comporbarReservacionPorId() {
		Reservacion reserv= reservacionservice.getReservacionById(1);
		Assertions.assertThat(reserv).isNotNull();
		Assertions.assertThat(reserv.getCantidad()>=1).isTrue();
	}
	
	@Test
	public void comprobarRevisarReservacion() {
		boolean revisado= reservacionservice.revisarReservacion(1);
		Assertions.assertThat(revisado).isTrue();
	}
	
	@Test
	public void comprobarClientePorUsuario() {
		Cliente cli = reservacionservice.obtenerClientebyUsuario(1);
		Assertions.assertThat(cli).isNull();
	}
}
