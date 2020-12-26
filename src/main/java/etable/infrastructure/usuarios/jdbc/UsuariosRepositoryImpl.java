package etable.infrastructure.usuarios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import etable.domain.tipousuario.model.TipoUsuario;
import etable.domain.tipousuario.model.TipoUsuarioPermiso;
import etable.domain.tipousuario.repository.UsuariosRepository;
import etable.web.constants.querys.Query;

@Component
public class UsuariosRepositoryImpl implements UsuariosRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UsuariosRowMapper row;
	
	@Override
	public TipoUsuario agregarTipoUsuario(TipoUsuario tipousuario) {
		String q = Query.selectFromWhere(Query.TABLE_TIPOUSUARIO, "TIPONOMBRE", tipousuario.getTiponombre());
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(q);
		List<TipoUsuario> list = this.row.mapRowTipoUsuario(rows);
		if(!list.isEmpty()) {
			return null;
		} else { 
			final String query = Query.INSERT_TIPOUSUARIO;
			KeyHolder keyHolder = new GeneratedKeyHolder();
			jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
					PreparedStatement ps =
							connection.prepareStatement(query, new String[] {"id"});
						ps.setString(1, tipousuario.getTiponombre());
						ps.setString(2, tipousuario.getTipodescripcion());
						return ps;
					}
				},
				keyHolder);
				tipousuario.setCtipousuario(keyHolder.getKey().intValue());
			
			return tipousuario;
		}
	}

	@Override
	public TipoUsuario getTipoUsuarioById(int ctipousuario) {
		String query = Query.selectFromWhere(Query.TABLE_TIPOUSUARIO, "CTIPOUSUARIO", ctipousuario);
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<TipoUsuario> list = this.row.mapRowTipoUsuario(rows);
		if(!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<TipoUsuario> getTiposUsuario() {
		String query = Query.selectFrom(Query.TABLE_TIPOUSUARIO);
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		return this.row.mapRowTipoUsuario(rows);
	}

	@Override
	public TipoUsuario editTipoUsuario(TipoUsuario tipousuario) {
		String query = "UPDATE " + Query.TABLE_TIPOUSUARIO + " SET TIPONOMBRE = ? , TIPODESCRIPCION = ? WHERE CTIPOUSUARIO = ?";
		int success = this.jdbcTemplate.update(query, tipousuario.getTiponombre(), tipousuario.getTipodescripcion(), tipousuario.getCtipousuario());
		if(success == 1) {
			return tipousuario;
		}
		return null;
	}

	@Override
	public List<TipoUsuarioPermiso> getPermisosAsignadosDeTipoUsuario(int ctipousuario) {
		String query = Query.selectFromWhere(Query.TABLE_TIPOUSPERMISO, "CTIPOUSUARIO", ctipousuario);
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		return this.row.mapRowTipoUsuarioPermiso(rows);
	}

	@Override
	public boolean asignarPermisosParaTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos) {
		String query = "INSERT INTO " + Query.TABLE_TIPOUSPERMISO + " SET CTIPOUSUARIO = ?, CPERMISO = ?";
		int size = tipouspermisos.size();
		int i = 0;
		while(i < size) {
			int success = this.jdbcTemplate.update(query, tipouspermisos.get(i).getCtipousuario(), tipouspermisos.get(i).getCpermiso());
			if(success == 1) {
				i++;
			}
		}
		return true;
	}

	@Override
	public boolean editarPermisosDeTipoUsuario(List<TipoUsuarioPermiso> tipouspermisos) {
		String query = "UPDATE " + Query.TABLE_TIPOUSPERMISO + " SET CTIPOUSUARIO = ?, CPERMISO = ? WHERE CTIPOUSPERMISO = ?";
		int size = tipouspermisos.size();
		int i = 0;
		while(i < size) {
			int success = this.jdbcTemplate.update(query, 
					tipouspermisos.get(i).getCtipousuario(), tipouspermisos.get(i).getCpermiso(), 
					tipouspermisos.get(i).getCtipousuario());
			if(success == 1) {
				i++;
			}
		}
		return true;
	}

	@Override
	public boolean eliminarTipoUsuarioById(TipoUsuario tipousuario) {
		if (this.eliminarPermisosDeTipoUsuarioById(tipousuario.getCtipousuario())) {
			String query = "DELETE FROM " + Query.TABLE_TIPOUSUARIO + " WHERE CTIPOUSUARIO = ? ";
			int success = this.jdbcTemplate.update(query, tipousuario.getCtipousuario());
			if (success != 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminarPermisosDeTipoUsuarioById(int id) {
		String query = "DELETE FROM " + Query.TABLE_TIPOUSPERMISO + " WHERE CTIPOUSUARIO = ?";
		int success = this.jdbcTemplate.update(query, id);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removerPermisos(List<TipoUsuarioPermiso> tipouspermisos) {
		String query = "DELETE FROM " + Query.TABLE_TIPOUSPERMISO + " WHERE CTIPOUSPERMISO = ?";
		tipouspermisos.forEach(o -> this.jdbcTemplate.update(query, o.getCtipouspermiso()));
		return true;
	}

}
