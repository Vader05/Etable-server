package etable.domain.mesa.model;


public class EstadoMesa {
	private int cestadomesa;
	private String emdescripcion;

	public EstadoMesa() {

	}

	public EstadoMesa(int cestadomesa, String emdescripcion) {
		super();
		this.cestadomesa = cestadomesa;
		this.emdescripcion = emdescripcion;
	}

	public int getCestadomesa() {
		return cestadomesa;
	}

	public void setCestadomesa(int cestadomesa) {
		this.cestadomesa = cestadomesa;
	}

	public String getEmdescripcion() {
		return emdescripcion;
	}

	public void setEmdescripcion(String emdescripcion) {
		this.emdescripcion = emdescripcion;
	}

}
