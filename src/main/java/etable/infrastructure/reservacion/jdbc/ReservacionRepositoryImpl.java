package etable.infrastructure.reservacion.jdbc;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import etable.domain.cliente.model.Cliente;
import etable.domain.reservacion.model.Reservacion;
import etable.domain.reservacion.model.ReservacionDTO;
import etable.domain.reservacion.model.ReservacionDTOCli;
import etable.domain.reservacion.repository.ReservacionRepository;
import etable.web.constants.querys.Query;

@Component
public  class ReservacionRepositoryImpl implements ReservacionRepository{


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ReservacionRowMapper row;


	public Reservacion crearReservacion(Reservacion reservacion) {
		String insertQuery = "insert into " + Query.TABLE_RESERVACION
				+ " (CCLIENTE,CESTADO,COMENTARIO,FECHA,HORA,CANTIDAD,CONFIRMADA) values (?, ?, ?,?, ?, ?,?)";
		int success = this.jdbcTemplate.update(insertQuery,reservacion.getCcliente(), reservacion.getCestado(),
				reservacion.getComentario(), reservacion.getFecha(), reservacion.getHora(),reservacion.getCantidad(), 
				reservacion.isConfirmada());
		if (success >= 0) {
			return reservacion;
		}
		return null;
	}


	@Override
	public Cliente obtenerClientebyUsuario(int cusuario) {
		String findCliente = Query.selectFromWhere(Query.TABLE_CLIENTES, "CUSUARIO", cusuario);
		List<Cliente> cliente = this.row.getIdCliente(this.jdbcTemplate.queryForList(findCliente));
		if (!cliente.isEmpty()) {
			return cliente.get(0);
		}
		return null;
	}

	public Reservacion getReservacionById(int id) {
		String Reservacion = Query.selectFromWhere(Query.TABLE_RESERVACION, "CRESERVA", id);
		List<Reservacion> rsvc = this.row.getReservacionesbyId(this.jdbcTemplate.queryForList(Reservacion));
		if (!rsvc.isEmpty()) {
			return rsvc.get(0);
		}
		return null;
		
	}
	
	
	@Override
	public List<Reservacion> listReservacionesbyId(int id) {
		String query = Query.selectFromWhere(Query.TABLE_RESERVACION, "CCLIENTE", id);
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Reservacion> reservacion = row.getReservacionesbyId(rows);
		if (!reservacion.isEmpty()) {
			return reservacion;
		}
		return Collections.emptyList();
	}


	@Override
	public List<ReservacionDTO> listReservacionesbyIdDTO(int id) {
		String query = "SELECT * FROM TBRESERVACION AS M  INNER JOIN TBESTADORESERVACION AS N ON M.CESTADO = N.CESTADO " + " WHERE CCLIENTE = ? " ;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query,id);
		return row.getReservacionesbyIdDTO(rows);
	}


	@Override
	public List<ReservacionDTOCli> listReservacionesDTO() {
		String query = "SELECT * FROM TBRESERVACION AS M INNER JOIN TBESTADORESERVACION AS N ON M.CESTADO = N.CESTADO INNER JOIN tbclientes AS C ON M.CCLIENTE = C.CCLIENTE INNER JOIN tbusuarios AS U ON C.CUSUARIO = U.CUSUARIO "; 
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		return  row.getReservacionesDTO(rows);

	}

	@Override
	public boolean anularReservacion(int id)  {
		Reservacion rv = getReservacionById(id);
		String query = 	"UPDATE " + Query.TABLE_RESERVACION +" SET CESTADO = ?  WHERE CRESERVA = ? ";
		int update = this.jdbcTemplate.update(query, 4 , rv.getCreserva());
		
		if(update == 1) {
			return true;
		} 
		return false;
	}
	
	@Override
	public boolean revisarReservacion(int id) {
		Reservacion rv = getReservacionById(id);
		String query = 	"UPDATE " + Query.TABLE_RESERVACION + " SET CONFIRMADA = ?  WHERE CRESERVA = ?";
		int update = this.jdbcTemplate.update(query, 1 , rv.getCreserva());
		if(update == 1) {
			return true;
		} 
			return false;
	}

}
