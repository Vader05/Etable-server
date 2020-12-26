package etable.domain.cliente.repository;

import etable.domain.cliente.model.Cliente;

public interface ClienteRepository {

	Cliente crearCliente(Cliente cliente);
	boolean eliminarCliente(int id);
}
