package etable.application.mesa;

import java.util.List;

import etable.domain.mesa.model.EstadoMesa;

public interface EstadoMesaService {

	List<EstadoMesa> getEstadoMesas();
	EstadoMesa getEstadoMesaById(int id);
	
}
