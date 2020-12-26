package etable.infrastructure.mesa.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.MesaDTO;

@Component
public class MesaRowMapper implements RowMapper {

	private static final String CMESA = "CMESA";
	private static final String NOMBREMESA = "NOMBREMESA";

	public List<Mesa> getMesa(List<Map<String, Object>> rows){
		List<Mesa> mesas = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int cmesa = Integer.parseInt(row.get(CMESA).toString());
			int cperfilmesa = Integer.parseInt(row.get("CPERFILMESA").toString());
			int cestadomesa = Integer.parseInt(row.get("CESTADOMESA").toString());
			String nombreMesa = row.get(NOMBREMESA).toString();
			Mesa i = new Mesa(cmesa,cperfilmesa,cestadomesa, nombreMesa);
			mesas.add(i);
		}
		return mesas;
	}
	
	public List<MesaDTO> mapRowMesaDTO(List<Map<String, Object>> rows){
		List<MesaDTO> mesas = new ArrayList<>();
		for(Map<String, Object> row: rows) {
			int cmesa = Integer.parseInt(row.get(CMESA).toString());
			String nombremesa =row.get(NOMBREMESA).toString();
			String emdescripcion =row.get("EMDESCRIPCION").toString();
			String pmnombre = row.get("PMNOMBRE").toString();
			int pmcapacidad = Integer.parseInt(row.get("PMCAPACIDAD").toString());
			MesaDTO i = new MesaDTO(cmesa,nombremesa, emdescripcion,pmnombre, pmcapacidad);
			mesas.add(i);
		}
		return mesas;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
