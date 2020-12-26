package etable.domain.mesa.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.PerfilMesa;
import etable.domain.mesa.repository.PerfilMesaRepository;

@Component
public class FabricaImpl implements IFabrica{

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PerfilMesaRepository repositoryPerfilMesa;
	
	@Override
	public Mesa fabricarMesa(Mesa mesa) {
		IProducto factory;
		PerfilMesa perfilMesa = this.repositoryPerfilMesa.getPerfilMesaById(mesa.getCperfilmesa());
		if (perfilMesa == null) {
			log.info("No se ha podido fabricar la mesa");
			return null;
		}
		factory = new MesaFactory(mesa);
		log.info("Fabricando mesa con {} de capacidad total de personas.", perfilMesa.getPmcapacidad());
		return factory.getMesa();
	}

}
