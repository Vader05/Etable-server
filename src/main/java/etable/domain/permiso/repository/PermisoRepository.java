package etable.domain.permiso.repository;

import java.util.List;

import etable.domain.permiso.model.Permiso;

public interface PermisoRepository {

	List<Permiso> getPermisos();
	List<Permiso> getPermisosBySubItem(int csubitem);
	Permiso editPermisoById(Permiso permiso);
	Permiso getPermisoById(int cpermiso);
}
