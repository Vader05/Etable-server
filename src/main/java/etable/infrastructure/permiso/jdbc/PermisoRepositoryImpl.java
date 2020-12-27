package etable.infrastructure.permiso.jdbc;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import etable.domain.permiso.model.Permiso;
import etable.domain.permiso.repository.PermisoRepository;
import etable.web.constants.querys.Query;


/**
 * 
 * @author Kevin Rodrigo
 *
 */
@Component
public class PermisoRepositoryImpl implements PermisoRepository {

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Autowired
	private PermisoRowMapper row;

	@Override
	public List<Permiso> getPermisos() {
		String query = "SELECT * FROM " + Query.TABLE_PERMISOS;
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		return this.row.mapRowPermisos(rows);
	}

	@Override
	public List<Permiso> getPermisosBySubItem(int csubitem) {
		String query = Query.selectFromWhere(Query.TABLE_PERMISOS, "CSUBITEM", csubitem);
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		return this.row.mapRowPermisos(rows);
	}

	@Override
	public Permiso editPermisoById(Permiso permiso) {
		String query = "UPDATE " + Query.TABLE_PERMISOS + " SET PERMISO = ? , DESCRIPCION = ? , ESTADO = ? WHERE CPERMISO = ? ";
		int update = this.jdbctemplate.update(query, permiso.getPermiso(), permiso.getDescripcion(),
				permiso.isEstado()? 1 : 0, permiso.getCpermiso());
		if (update == 1) {
			return permiso;
		}
		return null;
	}

	@Override
	public Permiso getPermisoById(int cpermiso) {
		String query = Query.selectFromWhere(Query.TABLE_PERMISOS, "CPERMISO", cpermiso);
		List<Map<String, Object>> rows = this.jdbctemplate.queryForList(query);
		List<Permiso> permisos = this.row.mapRowPermisos(rows);
		if(permisos != null && !permisos.isEmpty()) {
			Permiso permiso = permisos.get(0);
			return permiso;
		}
		return null;
	}

}
