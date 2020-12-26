package etable.domain.user.repository;

import java.util.List;

import etable.domain.cliente.model.Cliente;
import etable.domain.cliente.model.ClienteDTO;
import etable.domain.user.model.User;
import etable.domain.user.model.UserDTO;

public interface UserRepository {

	User crearUsuario(User user, String password);
	User editUser(User user);
	List<UserDTO> getUsuarios();
	User getUsuarioByAuthentication(String nickname, String password);
	User getUsuarioById(int id);
	boolean deleteUser(int id);

	Cliente crearCliente(User user, Cliente cliente);
	Cliente getClienteByUserId(int id);
	ClienteDTO getClienteById(int id);
	List<ClienteDTO> getClientes();
	Cliente editCliente(Cliente cliente);
	boolean eliminarClienteById(ClienteDTO cliente);
}
