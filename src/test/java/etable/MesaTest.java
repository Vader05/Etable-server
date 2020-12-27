package etable;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.mesa.EstadoMesaServiceImpl;
import etable.application.mesa.MesaServiceImpl;
import etable.domain.mesa.model.EstadoMesa;
import etable.domain.mesa.model.Mesa;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MesaTest {
	
	@Autowired
	private MesaServiceImpl mesaService;
	
	@Autowired
	private EstadoMesaServiceImpl estadoMesaService;
	
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
}
