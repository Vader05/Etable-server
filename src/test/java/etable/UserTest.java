package etable;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import etable.application.user.UserServiceImpl;
import etable.domain.cliente.model.Cliente;
import etable.domain.cliente.model.ClienteDTO;
import etable.domain.user.model.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
	
	@Autowired
	private UserServiceImpl usuarioService;

	@Test
	public void getUsers() {
		int dimension = usuarioService.getUsuarios().size();
		Assertions.assertThat(dimension>=0).isTrue();
	}
	
	@Test
	public void getUser() {
		User userBuscado = usuarioService.getUsuarioById(1);
		boolean result ;
		if(userBuscado != null) {
			result = true;
		}else {
			result = false;
		}
		Assertions.assertThat(result).isTrue();
	}
	
	@Test
	public void getCliente() {
		List<ClienteDTO> clientes= usuarioService.getClientes();
		Assertions.assertThat(clientes.size()).isPositive();
	}
	
	@Test
	public void comprobarGetClienteById() {
		ClienteDTO cliente = usuarioService.getClienteById(1);
		Assertions.assertThat(cliente).isNotNull();
	}
	
	@Test
	public void getClienteByUserId() {
		Cliente clientebd =new Cliente(1,77343939,3,"red1rc2@gmail.com","955502272","1999-04-05");
		Cliente cliente = usuarioService.getClienteByUserId(3);
		Assertions.assertThat(cliente.getPhone()).isEqualTo(clientebd.getPhone());
		Assertions.assertThat(cliente.getDni()).isEqualTo(clientebd.getDni());
	}
}
