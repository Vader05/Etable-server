package etable.domain.mesa.repository;

import java.util.List;

import etable.domain.mesa.model.PerfilMesa;

public interface PerfilMesaRepository {

	List<PerfilMesa> getPerfilMesas();
	PerfilMesa actualizarPerfilMesaById(PerfilMesa perfilmesa, int id);
	boolean eliminarPerfilMesaById(int id);
	PerfilMesa crearPerfilMesa(PerfilMesa perfilmesa);
	PerfilMesa getPerfilMesaById(int id);
}
