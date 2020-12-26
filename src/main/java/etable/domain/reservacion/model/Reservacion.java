package etable.domain.reservacion.model;

public class Reservacion {
	private int creserva;
	private int ccliente;
	private int cestado;
	private String comentario;
	private String fecha;
	private String hora;
	private int cantidad;
	private boolean confirmada;

	public Reservacion() {

	}


	public Reservacion(int creserva, int ccliente, int cestado, String comentario, String fecha,String hora, int cantidad,
			boolean confirmada) {
		super();
		this.creserva = creserva;
		this.ccliente = ccliente;
		this.cestado = cestado;
		this.comentario = comentario;
		this.fecha = fecha;
		this.hora = hora;
		this.cantidad = cantidad;
		this.confirmada = confirmada;
	}
	public Reservacion(int creserva, int ccliente, int cestado, String fecha,String hora, int cantidad,
			boolean confirmada) {
		super();
		this.creserva = creserva;
		this.ccliente = ccliente;
		this.cestado = cestado;
		this.fecha = fecha;
		this.hora = hora;
		this.cantidad = cantidad;
		this.confirmada = confirmada;
	}
	
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setCcliente(int ccliente) {
		this.ccliente = ccliente;
	}
	
	public int getCestado() {
		return cestado;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setCreserva(int creserva) {
		this.creserva = creserva;
	}

	public int getCreserva() {
		return creserva;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public int getCcliente() {
		return ccliente;
	}

	public void setCestado(int cestado) {
		this.cestado = cestado;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public String getFecha() {
		return fecha;
	}

	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isConfirmada() {
		return confirmada;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}

}
