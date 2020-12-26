package etable.domain.configuracion.repository;

import etable.domain.configuracion.model.Configuracion;
import etable.domain.configuracion.model.Image;

public interface ConfiguracionRepository{

	Configuracion getConfiguracion();
	Configuracion actualizarById(Configuracion configuracion, Image image);
	Configuracion getParametrosGenerales();
	Configuracion actualizarParametrosById(Configuracion configuracion);
}
