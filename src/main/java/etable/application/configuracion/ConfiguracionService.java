package etable.application.configuracion;

import etable.domain.configuracion.model.Configuracion;
import etable.domain.configuracion.model.Image;

public interface ConfiguracionService {

	Configuracion getConfiguracion();
	Configuracion actualizarConfiguracion(Configuracion configuracion, Image image);
	Configuracion getParametros();
	Configuracion actualizarParametrosById(Configuracion configuracion);
}
