package etable.domain.mesa.repository;

import java.util.List;

import etable.domain.mesa.model.EstadoMesa;

public interface EstadoMesaRepository {

	List<EstadoMesa> getEstadoMesas();

	EstadoMesa getEstadoMesaById(int id);
}
