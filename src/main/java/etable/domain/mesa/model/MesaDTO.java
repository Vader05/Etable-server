package etable.domain.mesa.model;


public class MesaDTO {
	private String nombremesa;
	private int cmesa;
	private String emdescripcion; //estado
	private String pmnombre; // perfil
	private int pmcapacidad;

	public MesaDTO() {

	}

	public MesaDTO(int cmesa,String nombremesa, String emdescripcion, String pmnombre, int pmcapacidad) {
		super();
		this.cmesa = cmesa;
		this.nombremesa = nombremesa;
		this.emdescripcion = emdescripcion;
		this.pmnombre = pmnombre;
		this.pmcapacidad = pmcapacidad;
	}

	public String getNombremesa() {
		return nombremesa;
	}

	public void setNombremesa(String nombremesa) {
		this.nombremesa = nombremesa;
	}

	public int getCmesa() {
		return cmesa;
	}

	public void setCmesa(int cmesa) {
		this.cmesa = cmesa;
	}

	public String getEmdescripcion() {
		return emdescripcion;
	}

	public void setEmdescripcion(String emdescripcion) {
		this.emdescripcion = emdescripcion;
	}

	public String getPmnombre() {
		return pmnombre;
	}

	public void setPmnombre(String pmnombre) {
		this.pmnombre = pmnombre;
	}

	public int getPmcapacidad() {
		return pmcapacidad;
	}

	public void setPmcapacidad(int pmcapacidad) {
		this.pmcapacidad = pmcapacidad;
	}


	
}
