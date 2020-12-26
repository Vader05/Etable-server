package etable.application.tipousuario;

import java.util.List;

import etable.domain.tipousuario.model.TipoUsuario;
import etable.domain.tipousuario.model.TipoUsuarioPermiso;

public interface TipoUsuarioService {

	TipoUsuario crearTipoUsuario(TipoUsuario tipoUsuario);
	TipoUsuario getTipoUsuarioById(int ctipousuario);
	List<TipoUsuario> getTiposUsuario();
	TipoUsuario editTipoUsuario(TipoUsuario tipousuario);
	boolean eliminarTipoUsuarioById(int id);
	
	List<TipoUsuarioPermiso> getPermisosAsignadosDeTipoUsuario(int ctipousuario);
	boolean asignarPermisosParaTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos);
	boolean editarPermisosDeTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos);
	boolean removerPermisos(List<TipoUsuarioPermiso> tipouspermisos);

}
