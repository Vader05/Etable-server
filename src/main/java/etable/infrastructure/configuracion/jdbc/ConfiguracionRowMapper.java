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
			
			boolean sist_reservacion_cliente = (Integer.parseInt(row.get("SIST_RESERVACION_CLIENTE").toString()) == 1 ? true: false);
			boolean sist_atencion_cliente = (Integer.parseInt(row.get("SIST_ATENCION_CLIENTE").toString()) == 1 ? true: false);
			boolean mesas_compuestas = (Integer.parseInt(row.get("MESAS_COMPUESTAS").toString()) == 1 ? true: false);
			boolean agregar_cliente_manual = (Integer.parseInt(row.get("AGREGAR_CLIENTE_MANUAL").toString()) == 1 ? true: false);
			boolean pagos_tarjeta_credito = (Integer.parseInt(row.get("PAGOS_TARJETA_CREDITO").toString()) == 1 ? true: false);
			boolean reservacion_pedidos = (Integer.parseInt(row.get("RESERVACION_PEDIDOS").toString()) == 1 ? true: false);
			boolean reservas_especiales = (Integer.parseInt(row.get("RESERVAS_ESPECIALES").toString()) == 1 ? true: false);
			boolean reservas_no_sesionadas = (Integer.parseInt(row.get("RESERVAS_NO_SESIONADAS").toString()) == 1 ? true: false);
			String date_configurado = row.get("DATE_CONFIGURADO").toString();
			
			configuracion = new Configuracion(cconfiguracion, cempresa, empnombre, empdescripcion, empdireccion, empemail, empcelular,
					emplogo, sist_reservacion_cliente, sist_atencion_cliente, mesas_compuestas, agregar_cliente_manual, 
					pagos_tarjeta_credito, reservacion_pedidos, reservas_especiales, reservas_no_sesionadas, date_configurado);
		}
		return configuracion;
	}
	
	public Configuracion mapRowConfigParametros(List<Map<String, Object>> rows) {
		 Configuracion configuracion = null;
		 for(Map<String, Object> row: rows) {
			 int cant_max_mesas = Integer.parseInt(row.get("CANT_MAX_MESAS").toString());
			 int cant_max_us_registrados = Integer.parseInt(row.get("CANT_MAX_US_REGISTRADOS").toString());
			 String horario_ini_atencion = row.get("HORARIO_INI_ATENCION").toString();
			 String horario_fin_atencion = row.get("HORARIO_FIN_ATENCION").toString();
			 String dias_atencion = row.get("DIAS_ATENCION").toString();
			 int max_us_trab_conectados = Integer.parseInt(row.get("MAX_US_TRAB_CONECTADOS").toString());
			 
			 configuracion = new Configuracion(cant_max_mesas, cant_max_us_registrados, horario_ini_atencion, horario_fin_atencion, dias_atencion, max_us_trab_conectados);
		 }
		 return configuracion;
	}
	
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		return new int[0];
	}

}
