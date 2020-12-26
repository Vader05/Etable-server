package etable.domain.mesa.model;


public class PerfilMesa {
	private int cperfilmesa;
	private String pmnombre;
	private String pmdescripcion;
	private int pmcapacidad;
	private int pmcompuesta;

	public PerfilMesa() {

	}

	public PerfilMesa(int cperfilmesa, String pmnombre, String pmdescripcion, int pmcapacidad, int pmcompuesta) {
		super();
		this.cperfilmesa = cperfilmesa;
		this.pmnombre = pmnombre;
		this.pmdescripcion = pmdescripcion;
		this.pmcapacidad = pmcapacidad;
		this.pmcompuesta = pmcompuesta;
	}

	public int getCperfilmesa() {
		return cperfilmesa;
	}

	public void setCperfilmesa(int cperfilmesa) {
		this.cperfilmesa = cperfilmesa;
	}

	public String getPmnombre() {
		return pmnombre;
	}

	public void setPmnombre(String pmnombre) {
		this.pmnombre = pmnombre;
	}

	public String getPmdescripcion() {
		return pmdescripcion;
	}

	public void setPmdescripcion(String pmdescripcion) {
		this.pmdescripcion = pmdescripcion;
	}

	public int getPmcapacidad() {
		return pmcapacidad;
	}

	public void setPmcapacidad(int pmcapacidad) {
		this.pmcapacidad = pmcapacidad;
	}

	public int getPmcompuesta() {
		return pmcompuesta;
	}

	public void setPmcompuesta(int pmcompuesta) {
		this.pmcompuesta = pmcompuesta;
	}
	
	
}
