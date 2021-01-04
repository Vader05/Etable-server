package etable.web.constants.querys;

public class UserQuery {

	public static final String TABLE = "tbusuarios";
	public static final String CUSUARIO = "CUSUARIO";
	public static final String NICKNAME = "NICKNAME";
	public static final String PASSWORD = "PASSWORD";
	public static final String ESTADO = "ESTADO";
	
	public static final String DELETE_FROM  = "DELETE FROM ";
	
	public static final String DELETE_TIPOBYID = DELETE_FROM + Query.TABLE_TIPOUSUARIO + " WHERE CTIPOUSUARIO = ?";
	public static final String DELETE_PERMISOTIPOBYID = DELETE_FROM + Query.TABLE_TIPOUSPERMISO + " WHERE CTIPOUSUARIO = ?";
	public static final String DELETE_REMOVEPERMISO = DELETE_FROM + Query.TABLE_TIPOUSPERMISO + " WHERE CTIPOUSPERMISO = ?";
	
	private UserQuery() {
		throw new IllegalStateException("Utility class");
	}
}
