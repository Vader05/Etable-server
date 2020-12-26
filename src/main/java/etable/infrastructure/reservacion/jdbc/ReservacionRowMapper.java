package etable.infrastructure.reservacion.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import etable.domain.cliente.model.Cliente;
import etable.domain.reservacion.model.Reservacion;
import etable.domain.reservacion.model.ReservacionDTO;
import etable.domain.reservacion.model.ReservacionDTOCli;

@Component
public class ReservacionRowMapper implements RowMapper {
	

	private static final String CCLIENTE = "CCLIENTE";
	private static final String CRESERVA = "CRESERVA";
	private static final String CESTADO = "CESTADO";
	private static final String COMENTARIO = "COMENTARIO";
	private static final String FECHA = "FECHA";
	private static final String CANTIDAD = "CANTIDAD";
	private static final String CONFIRMADA = "CONFIRMADA";
	
	public List<Cliente> getIdCliente(List<Map<String, Object>> rows){
		List<Cliente> cliente = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			int ccliente = Integer.parseInt(row.get(CCLIENTE).toString());
			int dni = Integer.parseInt(row.get("DNI").toString());
			int cusuario = Integer.parseInt(row.get("CUSUARIO").toString());
			String email = row.get("EMAIL").toString();
			String phone = row.get("PHONE").toString();
			String date = row.get("DATE").toString();
			Cliente i = new Cliente(ccliente,dni,cusuario, email,phone,date);
			cliente.add(i);
		}
		return cliente;
	}
	
	
	public List<Reservacion> getReservacionesbyId(List<Map<String, Object>> rows){
		List<Reservacion> reservacion = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			
			int creserva = Integer.parseInt(row.get(CRESERVA).toString());
			int ccliente = Integer.parseInt(row.get(CCLIENTE).toString());
			int cestado = Integer.parseInt(row.get(CESTADO).toString());
			String comentario;
			comentario =" ";
			if(row.get(COMENTARIO)!=null){
				 comentario = row.get(COMENTARIO).toString();
			}
			 
			String fecha = row.get(FECHA).toString();
			String hora = row.get("HORA").toString();
			int cantidad = Integer.parseInt(row.get(CANTIDAD).toString());
			boolean confirmada = Boolean.parseBoolean(row.get(CONFIRMADA).toString());
				
					Reservacion i = new Reservacion(creserva,ccliente,cestado, comentario ,fecha,hora,cantidad,confirmada);
					reservacion.add(i);
		}
			return reservacion;
	}
	
	public List<ReservacionDTO> getReservacionesbyIdDTO(List<Map<String, Object>> rows){
		List<ReservacionDTO> reservacion = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			
			int creserva = Integer.parseInt(row.get(CRESERVA).toString());
			int ccliente = Integer.parseInt(row.get(CCLIENTE).toString());
			int cestado = Integer.parseInt(row.get(CESTADO).toString());
			String comentario;
			comentario =" ";
			if(row.get(COMENTARIO)!=null){
				 comentario = row.get(COMENTARIO).toString();
			}
			String fecha = row.get(FECHA).toString();
			String hora = row.get("HORA").toString();
			int cantidad = Integer.parseInt(row.get(CANTIDAD).toString());
			boolean confirmada = Boolean.parseBoolean(row.get(CONFIRMADA).toString());
			String nomconfirmada = (confirmada) ? "Reservacion Revisada"   :   "Reservacion sin Revisar";
			String nomestado = row.get("NOMESTADO").toString();	
			ReservacionDTO i = new ReservacionDTO(creserva,ccliente,cestado, comentario ,fecha,hora,cantidad,confirmada,nomconfirmada,nomestado);
			reservacion.add(i);
		}
			return reservacion;
	}
	
	

	public List<ReservacionDTOCli> getReservacionesDTO(List<Map<String, Object>> rows){
		List<ReservacionDTOCli> reservacion = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			
			int creserva = Integer.parseInt(row.get(CRESERVA).toString());
			int ccliente = Integer.parseInt(row.get(CCLIENTE).toString());
			int cestado = Integer.parseInt(row.get(CESTADO).toString());
			String comentario=" ";
			if(row.get(COMENTARIO)!=null){
				 comentario = row.get(COMENTARIO).toString();
			}
			 
			String fecha = row.get(FECHA).toString();
			String hora = row.get("HORA").toString();
			int cantidad = Integer.parseInt(row.get(CANTIDAD).toString());
			
			boolean confirmada = Boolean.parseBoolean(row.get(CONFIRMADA).toString());
			String nomconfirmada= (confirmada) ? "Reservacion Revisada"   :   "Reservacion sin Revisar";
			String nomestado = row.get("NOMESTADO").toString();	
			int cusuario = Integer.parseInt(row.get("CUSUARIO").toString());	
			String nickname = row.get("NICKNAME").toString();	
			ReservacionDTOCli i = new ReservacionDTOCli(creserva,ccliente,cestado, comentario ,fecha,hora,cantidad,
					confirmada,nomconfirmada,nomestado,
				cusuario,nickname);
					reservacion.add(i);
		}
			return reservacion;
	}
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}
}
