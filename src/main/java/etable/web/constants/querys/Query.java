package etable.web.constants.querys;

public class Query {

	public static final String TABLE_CONFIGURACION = "TBCONFIGURACIONSISTEMA"; 
	public static final String TABLE_MESA = "TBMESA";
	public static final String TABLE_PERFILMESA = "TBPERFILMESA";
	public static final String TABLE_ESTADOMESA = "TBESTADOMESA";
	public static final String TABLE_RESERVACION = "TBRESERVACION";
	public static final String TABLE_PERMISOS = "TBPERMISOS"; 
	public static final String TABLE_MENUITEMS = "TBMENUITEMS";
	public static final String TABLE_MENUSUBITEMS = "TBMENUSUBITEMS"; 
	public static final String TABLE_TIPOUSUARIO = "TBTIPOUSUARIO"; 
	public static final String TABLE_USUARIOS = "TBUSUARIOS";
	public static final String TABLE_TIPOUSPERMISO = "TBTIPOUSUARIOPERMISO";
	public static final String TABLE_CLIENTES = "TBCLIENTES"; 
	
	public static final String INSERT_TIPOUSUARIO = 
			"INSERT INTO " + TABLE_TIPOUSUARIO + "( TIPONOMBRE, TIPODESCRIPCION) VALUES (?,?)";
	
	public static final String INSERT_USUARIO = 
			"INSERT INTO " + TABLE_USUARIOS + "(NICKNAME, PASSWORD, CTIPOUSUARIO, USNOMBRE, USAPELLIDOS, ESTADO) VALUES (?, ?, ?, ? ,? ,?)";
	
	public static final String INSERT_CLIENTE = 
			"INSERT INTO " + TABLE_CLIENTES + "(DNI, CUSUARIO, EMAIL, PHONE, DATE) VALUES (?, ?, ?, ?, ?)";
	
	public static String UPDATE_CONFIGURACION =  
			"UPDATE " + Query.TABLE_CONFIGURACION + 
			" SET  CEMPRESA = ? , EMPNOMBRE = ? , EMPDIRECCION = ? ,EMPDESCRIPCION = ? , EMPEMAIL = ? , EMPCELULAR = ? , EMPLOGO = ? , "
			+ "SIST_RESERVACION_CLIENTE = ? , SIST_ATENCION_CLIENTE = ? , MESAS_COMPUESTAS = ? , AGREGAR_CLIENTE_MANUAL = ? , "
			+ "PAGOS_TARJETA_CREDITO = ? , RESERVACION_PEDIDOS = ? , RESERVAS_ESPECIALES = ? , RESERVAS_NO_SESIONADAS = ? , DATE_CONFIGURADO = ? "
			+ "WHERE CCONFIGURACION = ?";
	
	public static String UPDATE_PARAMETROS = 
			"UPDATE " + Query.TABLE_CONFIGURACION +
			" SET CANT_MAX_MESAS = ? , CANT_MAX_US_REGISTRADOS = ?, HORARIO_INI_ATENCION = ? , HORARIO_FIN_ATENCION = ? , DIAS_ATENCION = ? , MAX_US_TRAB_CONECTADOS = ?";

	private Query() {
		throw new IllegalStateException("Utility class");
	}
	 
	public static String selectFrom(String table) {
		return "SELECT * FROM " + table;
	}
	
	public static String selectFromWhere(String table, String field, int id) {
		return "SELECT * FROM " + table + " WHERE " + field + " = " + id;
	}
	
	public static String selectFromWhere(String table, String field, String val) {
		return "SELECT * FROM " + table + " WHERE " + field + " = '" + val + "'";
	}
}
