package etable.infrastructure.mesa.jdbc;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import etable.domain.mesa.factory.method.IFabrica;
import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.MesaDTO;
import etable.domain.mesa.repository.MesaRepository;
import etable.web.constants.querys.Query;

@Component
public class MesaRepositoryImpl implements MesaRepository{
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MesaRowMapper row;
	
	@Autowired
	private IFabrica fabrica;

	@Override
	public List<MesaDTO> getMesas() {
		String query = "SELECT * FROM TBMESA AS M INNER JOIN TBESTADOMESA "
				+ "AS N ON M.CESTADOMESA = N.CESTADOMESA INNER JOIN TBPERFILMESA"
				+ " AS T ON M.CPERFILMESA = T.CPERFILMESA" ;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		return row.mapRowMesaDTO(rows);
	}

	@Override
	public Mesa actualizarMesaById(Mesa mesa, int id) {
		String query = 	"UPDATE " + Query.TABLE_MESA + " SET NOMBREMESA = ? , CPERFILMESA = ? , CESTADOMESA = ? WHERE CMESA = ?";
		int update = this.jdbcTemplate.update(query, 
				mesa.getNombremesa(),
				mesa.getCperfilmesa(), 
				mesa.getCestadomesa(), 
				mesa.getCmesa());
		if(update == 1) {
			return mesa;
		}
		return null;
	}

	@Override
	public boolean  eliminarMesaById(int id) {
		String query = 	"DELETE FROM " + Query.TABLE_MESA +" WHERE CMESA = ?";
		int success = this.jdbcTemplate.update(query, id);
		return (success >= 0);
	}

	@Override
	public Mesa crearMesa(Mesa mesa) {
		if (this.fabrica.fabricarMesa(mesa) != null) {
			String insertQuery = "insert into "+ Query.TABLE_MESA +"(NOMBREMESA,CPERFILMESA,CESTADOMESA) values (?, ?, ?)";
			int success = this.jdbcTemplate.update( insertQuery, mesa.getNombremesa(),mesa.getCperfilmesa() , mesa.getCestadomesa());
			if (success >= 0) {
				return mesa;
			}	
		}
		return mesa;
	}

	@Override
	public Mesa getMesaById(int id) {
		String findMesa = Query.selectFromWhere(Query.TABLE_MESA, "CMESA", id);
		List<Mesa> mesa = this.row.getMesa(this.jdbcTemplate.queryForList(findMesa));
		if (!mesa.isEmpty()) {
			return mesa.get(0);
		}
		return null;
	}
	
}
