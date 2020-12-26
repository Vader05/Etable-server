package etable.domain.tipousuario.model;

public class TipoUsuarioPermiso {

	private int ctipouspermiso;
	private int ctipousuario;
	private int cpermiso;
	
	public TipoUsuarioPermiso() {
		
	}
	
	public TipoUsuarioPermiso(int ctipouspermiso, int ctipousuario, int cpermiso) {
		super();
		this.ctipouspermiso = ctipouspermiso;
		this.ctipousuario = ctipousuario;
		this.cpermiso = cpermiso;
	}
	public int getCtipouspermiso() {
		return ctipouspermiso;
	}
	public void setCtipouspermiso(int ctipouspermiso) {
		this.ctipouspermiso = ctipouspermiso;
	}
	public int getCtipousuario() {
		return ctipousuario;
	}
	public void setCtipousuario(int ctipousuario) {
		this.ctipousuario = ctipousuario;
	}
	public int getCpermiso() {
		return cpermiso;
	}
	public void setCpermiso(int cpermiso) {
		this.cpermiso = cpermiso;
	}
	
}
