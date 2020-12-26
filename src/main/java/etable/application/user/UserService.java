package etable.application.user;

import java.util.List;

import etable.domain.cliente.model.Cliente;
import etable.domain.cliente.model.ClienteDTO;
import etable.domain.user.model.User;
import etable.domain.user.model.UserDTO;

public interface UserService {

	User crearNuevoUsuario(User user);
	User actualizarUsuario(User user);
	List<UserDTO> getUsuarios();
	User getUsuarioByAuthentication(User user);
	User getUsuarioById(int id);
	boolean deleteUser(int id);
	
	Cliente crearCliente(User user , Cliente cliente);
	Cliente actualizarCliente(Cliente cliente);
	List<ClienteDTO> getClientes();
	Cliente getClienteByUserId(int id);
	ClienteDTO getClienteById(int id);
	boolean eliminarClienteById(int id);
}
