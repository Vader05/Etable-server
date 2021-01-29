package etable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.configuracion.ConfiguracionServiceImpl;
import etable.domain.configuracion.model.Configuracion;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfiguracionTest {
	
	Log log = LogFactory.getLog(ConfiguracionTest.class);
	
	@Autowired
	private ConfiguracionServiceImpl configuracionservice;
	
	@Test
	public void ComprobarGetConfiguracion() {
		Configuracion config= configuracionservice.getConfiguracion();
		Assertions.assertThat(config).isNotNull();
		Assertions.assertThat(config.getEmpdescripcion()).isNotEmpty();
	}
	
	@Test
	public void comprobarGetParametros() {
		Configuracion config = configuracionservice.getParametros();
		Assertions.assertThat(config).isNotNull();
		Assertions.assertThat(config.getEmpnombre()).isNotEqualTo(" ");
		Assertions.assertThat(config.getCconfiguracion()>=0).isTrue();
		Assertions.assertThat(config.getcantMaxMesas()).isPositive();
		Assertions.assertThat(config.getEmpcelular()>=0).isTrue();
		Assertions.assertThat(config.getEmpdireccion()).isNotEqualTo(" ");
	}
	

}
