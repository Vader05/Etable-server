package etable.application.permiso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etable.domain.permiso.model.Permiso;
import etable.domain.permiso.repository.PermisoRepository;

@Service
public class PermisoServiceImpl implements PermisoService{

	@Autowired
	private PermisoRepository repository;
	
	@Override
	public List<Permiso> getPermisos() {
		return this.repository.getPermisos();
	}

	@Override
	public List<Permiso> getPermisosBySubItem(int csubitem) {
		return this.repository.getPermisosBySubItem(csubitem);
	}

	@Override
	public Permiso updatePermisoById(Permiso permiso) {
		return this.repository.editPermisoById(permiso);
	}

	@Override
	public Permiso getPermisoById(int cpermiso) {
		return this.repository.getPermisoById(cpermiso);
	}

}
