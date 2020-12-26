package etable.application.permiso;

import java.util.List;

import etable.domain.permiso.model.Permiso;

public interface PermisoService {

	List<Permiso> getPermisos();
	List<Permiso> getPermisosBySubItem(int csubitem);
	Permiso getPermisoById(int cpermiso);
	Permiso updatePermisoById(Permiso permiso);
}
