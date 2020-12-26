package etable.domain.cliente.model;

public class Cliente {

	private int ccliente;
	private int dni;
	private int cusuario;
	private String email;
	private String phone;
	private String date;
	
	public Cliente() { }
	
	public Cliente(int ccliente, int dni, int cusuario, String email, String phone, String date) {
		super();
		this.ccliente = ccliente;
		this.dni = dni;
		this.cusuario = cusuario;
		this.email = email;
		this.phone = phone;
		this.date = date;
	}

	public int getCcliente() {
		return ccliente;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCusuario(int cusuario) {
		this.cusuario = cusuario;
	}

	public String getEmail() {
		return email;
	}
	
	public int getCusuario() {
		return cusuario;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCcliente(int ccliente) {
		this.ccliente = ccliente;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPhone() {
		return phone;
	}

}
