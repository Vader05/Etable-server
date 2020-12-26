package etable.infrastructure.mesa.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.mesa.model.PerfilMesa;

@Component
public class PerfilMesaRowMapper implements RowMapper {

	public List<PerfilMesa> mapRowPerfilMesa(List<Map<String, Object>> rows){
		List<PerfilMesa> perfilmesas = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int cperfilmesa = Integer.parseInt(row.get("CPERFILMESA").toString());
			String pmnombre =row.get("PMNOMBRE").toString();
			String pmdescripcion = row.get("PMDESCRIPCION").toString();
			int pmcapacidad = Integer.parseInt(row.get("PMCAPACIDAD").toString());
			int pmcompuesta = Integer.parseInt(row.get("PMCOMPUESTA").toString());
			
			PerfilMesa i = new PerfilMesa(cperfilmesa,pmnombre,pmdescripcion, pmcapacidad,pmcompuesta);
			perfilmesas.add(i);
		}
		return perfilmesas;
	}
	
	public List<PerfilMesa> getPerfilMesa(List<Map<String, Object>> rows){
		List<PerfilMesa> perfilMesa = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			int cperfilmesa = Integer.parseInt(row.get("CPERFILMESA").toString());
			String pmnombre =row.get("PMNOMBRE").toString();
			String pmdescripcion = row.get("PMDESCRIPCION").toString();
			int pmcapacidad = Integer.parseInt(row.get("PMCAPACIDAD").toString());
			int pmcompuesta = Integer.parseInt(row.get("PMCOMPUESTA").toString());
			PerfilMesa perfil = new PerfilMesa(cperfilmesa,pmnombre,pmdescripcion, pmcapacidad,pmcompuesta);
			perfilMesa.add(perfil);
		}
		return perfilMesa;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
