package etable;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.mesa.EstadoMesaServiceImpl;
import etable.application.mesa.MesaServiceImpl;
import etable.application.mesa.PerfilMesaServiceImpl;
import etable.domain.mesa.model.EstadoMesa;
import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.PerfilMesa;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MesaTest {
	
	Log log = LogFactory.getLog(MesaTest.class);
	
	@Autowired
	private MesaServiceImpl mesaService;
	
	@Autowired
	private EstadoMesaServiceImpl estadoMesaService;
	
	@Autowired
	private PerfilMesaServiceImpl perfilmesaService;
	
	@Test
	public void getMesas() {
		int dimension = mesaService.getMesas().size();
		Assertions.assertThat(dimension>=0).isTrue();
	}
	
	@Test
	public void getMesaById() {
		Mesa mesabd = mesaService.getMesaById(1);
		boolean result ;
		if(mesabd != null) {
			result = true;
		}else {
			result = false;
		}
		Assertions.assertThat(result).isTrue();
	}
	
	@Test
	public void comprobarActualizarMesa() {
		Mesa mesabd= mesaService.getMesaById(1);
		Assertions.assertThat(mesabd).isNotNull();
		mesabd.setNombremesa("Express");
		Mesa update = mesaService.actualizarMesaById(mesabd, mesabd.getCmesa());
		log.info(mesabd.getCmesa());
		Assertions.assertThat(update.getNombremesa()).isEqualTo(mesabd.getNombremesa());
	}
	
	@Test
	public void getEstadoMesas() {
		List<EstadoMesa> listaestado = estadoMesaService.getEstadoMesas();
		Assertions.assertThat(listaestado.get(0).getEmdescripcion()).isEqualTo("Habilitada");
		Assertions.assertThat(listaestado.get(1).getEmdescripcion()).isEqualTo("En Reparación");
		Assertions.assertThat(listaestado.get(2).getEmdescripcion()).isEqualTo("Desuso");
	}
	
	@Test
	public void getEstadoMesaById() {
		EstadoMesa estadomesa = estadoMesaService.getEstadoMesaById(1);
		Assertions.assertThat(estadomesa.getCestadomesa()).isEqualTo(1);
	}
	
	@Test
	public void comprobarGetPerfilMesas() {
		List<PerfilMesa> perfilesmesa = perfilmesaService.getPerfilMesas();
		Assertions.assertThat(perfilesmesa).isNotEmpty();
	}
	
	@Test
	public void comprobarGetPerfilMesaById() {
		PerfilMesa perfilmesa = perfilmesaService.getPerfilMesaById(1);
		Assertions.assertThat(perfilmesa).isNotNull();
		Assertions.assertThat(perfilmesa.getPmnombre()).isEqualTo("Individual");
	}
	
	@Test
	public void comprobarActualizarPerfilMesa() {
		PerfilMesa perfilmesa= new PerfilMesa(1,"Individual","Es una mesa individual",1,0);
		PerfilMesa pmbd = perfilmesaService.actualizarPerfilMesaById(perfilmesa, 1);
		Assertions.assertThat(pmbd).isNotNull();
	}
}
