package etable.infrastructure.mesa.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.mesa.model.EstadoMesa;

@Component
public class EstadoMesaRowMapper implements RowMapper {

	public List<EstadoMesa> mapRowEstadoMesa(List<Map<String, Object>> rows){
		List<EstadoMesa> estadomesas = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			
			int cestadomesa = Integer.parseInt(row.get("CESTADOMESA").toString());
			String emdescripcion = row.get("EMDESCRIPCION").toString();
			EstadoMesa i = new EstadoMesa(cestadomesa,emdescripcion);
			estadomesas.add(i);
		}
		return estadomesas;
	}
	
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
