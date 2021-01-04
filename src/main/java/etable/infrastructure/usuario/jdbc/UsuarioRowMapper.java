package etable.infrastructure.usuario.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import etable.domain.cliente.model.Cliente;
import etable.domain.cliente.model.ClienteDTO;
import etable.domain.user.model.User;
import etable.domain.user.model.UserDTO;

@Component
public class UsuarioRowMapper {

	final Logger log = LoggerFactory.getLogger(this.getClass());
	private static final String CUSUARIO = "CUSUARIO";
	private static final String NICKNAME = "NICKNAME";
	private static final String USNOMBRE = "USNOMBRE";
	private static final String USAPELLIDOS = "USAPELLIDOS";
	private static final String ESTADO = "ESTADO";
	
	public List<User> mapRowUsuario(List<Map<String, Object>> rows){
		List<User> users = new ArrayList<>();
		log.info("Obteniendo lista de usuario");
		for(Map<String, Object> row: rows) {
			int cusuario = Integer.parseInt(row.get(CUSUARIO).toString()); 
			String nickname = row.get(NICKNAME).toString();
			String password = "";
			int ctipousuario = Integer.parseInt(row.get("CTIPOUSUARIO").toString()); 
			String usnombres = row.get(USNOMBRE).toString();
			String usapellidos = row.get(USAPELLIDOS).toString();
			boolean estado = Integer.parseInt(row.get(ESTADO).toString()) == 1 ;
			User user = User.getInstancia(cusuario, nickname, password, usnombres, usapellidos, estado, ctipousuario);
			users.add(user);
		}
		return users;
	}
	
	public List<User> getUser(List<Map<String, Object>> rows){
		List<User> users = new ArrayList<>();
		log.info("Obteniendo usuario para editar");
		for(Map<String, Object> row: rows) {
			int cusuario = Integer.parseInt(row.get(CUSUARIO).toString()); 
			String nickname = row.get(NICKNAME).toString();
			int ctipousuario = Integer.parseInt(row.get("CTIPOUSUARIO").toString()); 
			String usnombres = row.get(USNOMBRE).toString();
			String usapellidos = row.get(USAPELLIDOS).toString();
			String password = row.get("PASSWORD").toString();
			boolean estado = Integer.parseInt(row.get(ESTADO).toString()) == 1 ;
			User user = User.getInstancia(cusuario, nickname, password, usnombres, usapellidos, estado, ctipousuario);
			users.add(user);
		}
		return users;
	}
	
	public List<UserDTO> mapRowUsuarioDTO(List<Map<String, Object>> rows){
		List<UserDTO> users = new ArrayList<>();
		
		for(Map<String, Object> row: rows) {
			int cusuario = Integer.parseInt(row.get(CUSUARIO).toString()); 
			String nickname = row.get(NICKNAME).toString();
			String tiponombre = row.get("TIPONOMBRE").toString(); 
			String usnombres = row.get(USNOMBRE).toString();
			String usapellidos = row.get(USAPELLIDOS).toString();
			boolean estado = Integer.parseInt(row.get(ESTADO).toString()) == 1;
			UserDTO user = new UserDTO(cusuario, nickname, usnombres, usapellidos, estado, tiponombre);
			users.add(user);
		}
		return users;
	}
	
	public List<Cliente> mapRowCliente(List<Map<String, Object>> rows) {
		List<Cliente> clientes = new ArrayList<>();
		
		for(Map<String, Object> row : rows) {
			int ccliente = Integer.parseInt(row.get("CCLIENTE").toString());
			int dni = Integer.parseInt(row.get("DNI").toString());
			int cusuario = Integer.parseInt(row.get(CUSUARIO).toString());
			String email = row.get("EMAIL").toString();
			String phone = row.get("PHONE").toString();
			String date = row.get("DATE").toString();
			Cliente cliente = new Cliente(ccliente, dni, cusuario, email, phone, date);
			clientes.add(cliente);
		}
		return clientes;
	}
	
	public List<ClienteDTO> mapRowClienteDTO(List<Map<String, Object>> rows) {
		List<ClienteDTO> clientes = new ArrayList<>();
		
		for(Map<String, Object> row : rows) {
			int ccliente = Integer.parseInt(row.get("CCLIENTE").toString());
			int dni = Integer.parseInt(row.get("DNI").toString());
			int cusuario = Integer.parseInt(row.get(CUSUARIO).toString());
			String nickname = row.get(NICKNAME).toString();
			String password = row.get("PASSWORD").toString();
			String usnombre = row.get(USNOMBRE).toString();
			String usapellidos = row.get(USAPELLIDOS).toString();
			String email = row.get("EMAIL").toString();
			String phone = row.get("PHONE").toString();
			String date = row.get("DATE").toString();
			boolean estado = Integer.parseInt(row.get(ESTADO).toString()) == 1 ;
			ClienteDTO cliente = new ClienteDTO(ccliente, dni, usnombre, usapellidos, cusuario, email, phone, date, estado, nickname, password);
			clientes.add(cliente);
		}
		return clientes;
	}
}
