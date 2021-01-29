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

import etable.application.permiso.PermisoServiceImpl;
import etable.domain.permiso.model.Permiso;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PermisosTest {

	@Autowired
	private PermisoServiceImpl permisoservice;
	
	Log log= LogFactory.getLog(PermisosTest.class);
	
	@Test
	public void comprobarPermisosEnBD() {
		List<Permiso> permisos = permisoservice.getPermisos();
		log.info(permisos.get(0).getPermiso());
		Assertions.assertThat(permisos.size()).isPositive();
		Assertions.assertThat(permisos.get(0).getPermiso()).isNotEqualTo(" ");
	}
	
	@Test
	public void comprobarPermisosById() {
		Permiso permiso = permisoservice.getPermisoById(1);
		Assertions.assertThat(permiso.getPermiso()).isNotNull();
		
	}
}
