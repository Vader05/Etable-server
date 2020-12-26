package etable.application.mesa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etable.domain.mesa.model.EstadoMesa;
import etable.domain.mesa.repository.EstadoMesaRepository;

@Service
public class EstadoMesaServiceImpl implements EstadoMesaService{

	@Autowired
	private EstadoMesaRepository repository;

	@Override
	public List<EstadoMesa> getEstadoMesas() {
		return this.repository.getEstadoMesas();
	}

	@Override
	public EstadoMesa getEstadoMesaById(int id) {
		return this.repository.getEstadoMesaById(id);
	}

}
