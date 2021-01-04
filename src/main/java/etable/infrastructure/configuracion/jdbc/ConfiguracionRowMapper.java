package etable.infrastructure.configuracion.jdbc;

import java.util.List;
import java.util.Map;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import org.springframework.stereotype.Component;
import etable.domain.configuracion.model.Configuracion;

@Component
public class ConfiguracionRowMapper implements RowMapper{

	public Configuracion mapRowConfigSistema(List<Map<String, Object>> rows){
		 Configuracion configuracion = null;
		for(Map<String, Object> row: rows) {
			int cconfiguracion = Integer.parseInt(row.get("CCONFIGURACION").toString());
			int cempresa = Integer.parseInt(row.get("CEMPRESA").toString());
			String empnombre = row.get("EMPNOMBRE").toString();
			String empdescripcion = row.get("EMPDESCRIPCION").toString();
			String empdireccion = row.get("EMPDIRECCION").toString();
			String empemail = row.get("EMPEMAIL").toString();
			int empcelular = Integer.parseInt(row.get("EMPCELULAR").toString());
			String emplogo = row.get("EMPLOGO").toString();
			
			boolean sistReservacionCliente = devuelveBooleano(row,"sistReservacionCliente");
			boolean sistAtencionCliente = devuelveBooleano(row,"sistAtencionCliente");
			boolean mesasCompuestas = 	devuelveBooleano(row,"mesasCompuestas");
			boolean agregarClienteManual = devuelveBooleano(row,"agregarClienteManual");
			boolean pagosTarjetaCredito = devuelveBooleano(row,"pagosTarjetaCredito");
			boolean reservacionPedidos = devuelveBooleano(row,"reservacionPedidos");
			boolean reservasEspeciales = devuelveBooleano(row,"reservasEspeciales");
			boolean reservasNoSesionadas = devuelveBooleano(row,"reservasNoSesionadas");
			String dateConfigurado = row.get("dateConfigurado").toString();
			
			configuracion = new Configuracion(cconfiguracion, cempresa, empnombre, empdescripcion, empdireccion, empemail, empcelular,
					emplogo, sistReservacionCliente, sistAtencionCliente, mesasCompuestas, agregarClienteManual, 
					pagosTarjetaCredito, reservacionPedidos, reservasEspeciales, reservasNoSesionadas, dateConfigurado);
		}
		return configuracion;
	}
	
	public boolean devuelveBooleano(Map<String, Object> row,String nombre) {
		return (Integer.parseInt(row.get(nombre).toString()) == 1);
	}
	
	public Configuracion mapRowConfigParametros(List<Map<String, Object>> rows) {
		 Configuracion configuracion = null;
		 for(Map<String, Object> row: rows) {
			 int cantMaxMesas = Integer.parseInt(row.get("cantMaxMesas").toString());
			 int cantMaxUsRegistrados = Integer.parseInt(row.get("cantMaxUsRegistrados").toString());
			 String horarioIniAtencion = row.get("horarioIniAtencion").toString();
			 String horarioFinAtencion = row.get("horarioFinAtencion").toString();
			 String diasAtencion = row.get("diasAtencion").toString();
			 int maxUsTrabConectados = Integer.parseInt(row.get("maxUsTrabConectados").toString());
			 
			 configuracion = new Configuracion(cantMaxMesas, cantMaxUsRegistrados, horarioIniAtencion, horarioFinAtencion, diasAtencion, maxUsTrabConectados);
		 }
		 return configuracion;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}

}
