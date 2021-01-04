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
			
			boolean sistReservacionCliente = devuelveBooleano(row,"SIST_RESERVACION_CLIENTE");
			boolean sistAtencionCliente = devuelveBooleano(row,"SIST_ATENCION_CLIENTE");
			boolean mesasCompuestas = 	devuelveBooleano(row,"MESAS_COMPUESTAS");
			boolean agregarClienteManual = devuelveBooleano(row,"AGREGAR_CLIENTE_MANUAL");
			boolean pagosTarjetaCredito = devuelveBooleano(row,"PAGOS_TARJETA_CREDITO");
			boolean reservacionPedidos = devuelveBooleano(row,"RESERVACION_PEDIDOS");
			boolean reservasEspeciales = devuelveBooleano(row,"RESERVAS_ESPECIALES");
			boolean reservasNoSesionadas = devuelveBooleano(row,"RESERVAS_NO_SESIONADAS");
			String dateConfigurado = row.get("DATE_CONFIGURADO").toString();
			
			
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
			 int cantMaxMesas = Integer.parseInt(row.get("CANT_MAX_MESAS").toString());
			 int cantMaxUsRegistrados = Integer.parseInt(row.get("CANT_MAX_US_REGISTRADOS").toString());
			 String horarioIniAtencion = row.get("HORARIO_INI_ATENCION").toString();
			 String horarioFinAtencion = row.get("HORARIO_FIN_ATENCION").toString();
			 String diasAtencion = row.get("DIAS_ATENCION").toString();
			 int maxUsTrabConectados = Integer.parseInt(row.get("MAX_US_TRAB_CONECTADOS").toString());
			 
			 configuracion = new Configuracion(cantMaxMesas, cantMaxUsRegistrados, horarioIniAtencion, horarioFinAtencion, diasAtencion, maxUsTrabConectados);
		 }
		 return configuracion;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}

}
