package etable.domain.mesa.model;

public class Mesa{
	private int cmesa;
	private int cperfilmesa;
	private int cestadomesa;
	private String nombremesa;

	public Mesa() {

	}

	public Mesa(int cmesa, int cperfilmesa, int cestadomesa, String nombremesa) {
		super();
		this.cmesa = cmesa;
		this.cperfilmesa = cperfilmesa;
		this.cestadomesa = cestadomesa;
		this.nombremesa = nombremesa;
	}

	public int getCmesa() {
		return cmesa;
	}

	public void setCmesa(int cmesa) {
		this.cmesa = cmesa;
	}

	public int getCperfilmesa() {
		return cperfilmesa;
	}

	public void setCperfilmesa(int cperfilmesa) {
		this.cperfilmesa = cperfilmesa;
	}

	public int getCestadomesa() {
		return cestadomesa;
	}

	public void setCestadomesa(int cestadomesa) {
		this.cestadomesa = cestadomesa;
	}

	public String getNombremesa() {
		return nombremesa;
	}

	public void setNombremesa(String nombremesa) {
		this.nombremesa = nombremesa;
	}

	@Override
	public String toString() {
		return "Mesa [cmesa=" + cmesa + ", cperfilmesa=" + cperfilmesa + ", cestadomesa=" + cestadomesa
				+ ", nombremesa=" + nombremesa + "]";
	}
	
}
