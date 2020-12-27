package etable;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.tipousuario.TipoUsuarioServiceImpl;
import etable.domain.tipousuario.model.TipoUsuario;
import etable.domain.tipousuario.model.TipoUsuarioPermiso;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TipoUsuarioTest {

	@Autowired
	private TipoUsuarioServiceImpl tipoUsuarioServiceImpl;
	
	@Test
	public void getUsuarioById() {
		TipoUsuario tipousuario= new TipoUsuario(2, "Cliente", "El cliente puede ralizar reservaciones de mesas");
		TipoUsuario tipouser = tipoUsuarioServiceImpl.getTipoUsuarioById(2);
		assertEquals(tipousuario.getTiponombre(), tipouser.getTiponombre());
		
	}
	
	@Test
	public void getTipoUsuarios() {
		List<TipoUsuario> listatipo= tipoUsuarioServiceImpl.getTiposUsuario();
		
		Assertions.assertThat(listatipo.size()).isEqualTo(4);
	}
	
	@Test
	public void getListaPermisos() {
		List<TipoUsuarioPermiso> listatipopermisos= tipoUsuarioServiceImpl.getPermisosAsignadosDeTipoUsuario(1);
		Assertions.assertThat(listatipopermisos.get(0).getCtipousuario()).isEqualTo(1);
		Assertions.assertThat(listatipopermisos.get(0).getCpermiso()).isEqualTo(1);
		Assertions.assertThat(listatipopermisos.get(0).getCtipouspermiso()).isEqualTo(1);
	}
	
	
}
