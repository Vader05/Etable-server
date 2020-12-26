package etable.application.mesa;

import java.util.List;

import etable.domain.mesa.model.PerfilMesa;

public interface PerfilMesaService {


	List<PerfilMesa> getPerfilMesas();
	PerfilMesa actualizarPerfilMesaById(PerfilMesa perfilmesa, int id);
	boolean eliminarPerfilMesaById(int id);
	PerfilMesa crearPerfilMesa(PerfilMesa perfilmesa);
	PerfilMesa getPerfilMesaById(int id);
}
