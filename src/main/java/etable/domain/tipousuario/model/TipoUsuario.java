package etable.domain.tipousuario.model;

public class TipoUsuario {

	private int ctipousuario;
	private String tiponombre;
	private String tipodescripcion;
	
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(int ctipousuario, String tiponombre, String tipodescripcion) {
		super();
		this.ctipousuario = ctipousuario;
		this.tiponombre = tiponombre;
		this.tipodescripcion = tipodescripcion;
	}

	public int getCtipousuario() {
		return ctipousuario;
	}

	public void setCtipousuario(int ctipousuario) {
		this.ctipousuario = ctipousuario;
	}

	public String getTiponombre() {
		return tiponombre;
	}

	public void setTiponombre(String tiponombre) {
		this.tiponombre = tiponombre;
	}

	public String getTipodescripcion() {
		return tipodescripcion;
	}

	public void setTipodescripcion(String tipodescripcion) {
		this.tipodescripcion = tipodescripcion;
	}
	
}
