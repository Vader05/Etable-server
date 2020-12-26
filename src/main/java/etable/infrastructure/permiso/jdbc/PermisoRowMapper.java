package etable.infrastructure.permiso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.permiso.model.Permiso;

@Component
public class PermisoRowMapper implements RowMapper{

	
	public List<Permiso> mapRowPermisos(List<Map<String, Object>> rows){
		 List<Permiso> permisos = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int cpermiso = Integer.parseInt(row.get("CPERMISO").toString());
			int csubitem = Integer.parseInt(row.get("CSUBITEM").toString());
			String permiso = row.get("PERMISO").toString();
			String descripcion = row.get("DESCRIPCION").toString();
			boolean estado = Integer.parseInt(row.get("ESTADO").toString()) == 1 ? true : false;
			
			Permiso p = new Permiso(cpermiso, csubitem, permiso, descripcion, estado);
			permisos.add(p);
		}
		return permisos;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
