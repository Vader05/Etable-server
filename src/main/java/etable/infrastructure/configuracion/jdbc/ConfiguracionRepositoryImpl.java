package etable.infrastructure.configuracion.jdbc;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import etable.domain.configuracion.model.Configuracion;
import etable.domain.configuracion.model.Image;
import etable.domain.configuracion.repository.ConfiguracionRepository;
import etable.web.constants.querys.Query;

@Component
public class ConfiguracionRepositoryImpl implements ConfiguracionRepository {

	final Logger log = LoggerFactory.getLogger(this.getClass());
	private final JdbcTemplate jdbcTemplate;
	private final ConfiguracionRowMapper row;
	
	public ConfiguracionRepositoryImpl(JdbcTemplate jdbcTemplate, ConfiguracionRowMapper row) {
		this.jdbcTemplate = jdbcTemplate;
		this.row = row;
	}
	
	@Override
	public Configuracion getConfiguracion() {
		String query = "SELECT * FROM " + Query.TABLE_CONFIGURACION;
		Configuracion configuracion = null;
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
		configuracion = row.mapRowConfigSistema(rows);
		return configuracion;
	}

	@Override
	public Configuracion actualizarById(Configuracion configuracion, Image image) {
		String pathName="";
		try {
			pathName = image.saveImage();
		} catch (IOException e) {
			log.debug("error", e);
		}
		configuracion.setEmplogo(pathName);
		String query = Query.UPDATE_CONFIGURACION;
		int update = this.jdbcTemplate.update(query, configuracion.getCempresa(), 
						configuracion.getEmpnombre(), configuracion.getEmpdireccion(),
						configuracion.getEmpdescripcion(), configuracion.getEmpemail(),
						configuracion.getEmpcelular(), configuracion.getEmplogo(),
						configuracion.issistReservacionCliente() ? 1 : 0,
						configuracion.issistAtencionCliente() ? 1 : 0,
						configuracion.ismesasCompuestas() ? 1 : 0,
						configuracion.isagregarClienteManual() ? 1 : 0,
						configuracion.ispagosTarjetaCredito() ? 1 : 0,
						configuracion.isreservacionPedidos() ? 1 : 0,
						configuracion.isreservasEspeciales() ? 1 : 0,
						configuracion.isreservasNoSesionadas() ? 1 : 0,
						configuracion.getdateConfigurado(),
						configuracion.getCconfiguracion());
		
		if(update == 1) {
			return configuracion;
		}
		
		return null;
	}
	
	@Override
	public Configuracion actualizarParametrosById(Configuracion configuracion) {
		String query = Query.UPDATE_PARAMETROS;
		int update = this.jdbcTemplate.update(query, configuracion.getcantMaxMesas(), configuracion.getcantMaxUsRegistrados(), configuracion.gethorarioIniAtencion(), 
				configuracion.gethorarioFinAtencion(), configuracion.getdiasAtencion(), configuracion.getmaxUsTrabConectados());
		if( update == 1) {
			return configuracion;
		} else {
			return null;
		}
	}

	@Override
	public Configuracion getParametrosGenerales() {
		String query = "SELECT * FROM " + Query.TABLE_CONFIGURACION;
		Configuracion configuracion = null;
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
		configuracion = row.mapRowConfigParametros(rows);
		return configuracion;
	}
}
