package etable.application.tipousuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import etable.domain.tipousuario.model.TipoUsuario;
import etable.domain.tipousuario.model.TipoUsuarioPermiso;
import etable.domain.tipousuario.repository.UsuariosRepository;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService{

	@Autowired
	private UsuariosRepository repository;
	
	@Override
	public TipoUsuario crearTipoUsuario(TipoUsuario tipoUsuario) {
		return this.repository.agregarTipoUsuario(tipoUsuario);
	}

	@Override
	public TipoUsuario getTipoUsuarioById(int ctipousuario) {
		return this.repository.getTipoUsuarioById(ctipousuario);
	}

	@Override
	public List<TipoUsuario> getTiposUsuario() {
		return this.repository.getTiposUsuario();
	}

	@Override
	public TipoUsuario editTipoUsuario(TipoUsuario tipousuario) {
		return this.repository.editTipoUsuario(tipousuario);
	}

	@Override
	public List<TipoUsuarioPermiso> getPermisosAsignadosDeTipoUsuario(int ctipousuario) {
		return this.repository.getPermisosAsignadosDeTipoUsuario(ctipousuario);
	}

	@Override
	public boolean asignarPermisosParaTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos) {
		return this.repository.asignarPermisosParaTipoUsuario(tipouspermisos);
	}

	@Override
	public boolean editarPermisosDeTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos) {
		return this.repository.editarPermisosDeTipoUsuario(tipouspermisos);
	}
	
	@Override
	public boolean eliminarTipoUsuarioById(int id) {
		TipoUsuario tipousuario = this.getTipoUsuarioById(id);
		if (tipousuario != null) {
			return this.repository.eliminarTipoUsuarioById(tipousuario);
		}
		return false;
	}

	@Override
	public boolean removerPermisos(List<TipoUsuarioPermiso> tipouspermisos) {
		return this.repository.removerPermisos(tipouspermisos);
	}

}
