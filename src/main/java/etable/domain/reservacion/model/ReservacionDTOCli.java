package etable.domain.reservacion.model;

public class ReservacionDTOCli {
	
	private String nickname;
	private int cusuario;
	private String nomestado;
	private String nomconfirmada;
	private boolean confirmada;
	private int cantidad;
	private String hora;
	private String fecha;
	private String comentario;
	private int cestado;
	private int ccliente;
	private int creserva;
	
		
	public ReservacionDTOCli(int creserva, int ccliente, int cestado, String comentario, String fecha, String hora,
			int cantidad, boolean confirmada, String nomconfirmada, String nomestado, int cusuario, String nickname) {
		super();
		this.nickname = nickname;
		this.cusuario = cusuario;
		this.nomestado = nomestado;
		this.nomconfirmada = nomconfirmada;
		this.confirmada = confirmada;
		this.cantidad = cantidad;
		this.hora = hora;
		this.fecha = fecha;
		this.comentario = comentario;
		this.cestado = cestado;
		this.ccliente = ccliente;
		this.creserva = creserva;
		
	}
	
	
	public String getNomestado() {
		return nomestado;
	}
	
	public int getCusuario() {
		return cusuario;
	}
	
	public void setCestado(int cestado) {
		this.cestado = cestado;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getCreserva() {
		return creserva;
	}
	public void setCusuario(int cusuario) {
		this.cusuario = cusuario;
	}
	
	public void setNomestado(String nomestado) {
		this.nomestado = nomestado;
	}
	public String getComentario() {
		return comentario;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setCreserva(int creserva) {
		this.creserva = creserva;
	}
	public int getCcliente() {
		return ccliente;
	}
	
	public int getCestado() {
		return cestado;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setCcliente(int ccliente) {
		this.ccliente = ccliente;
	}
	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public String getNomconfirmada() {
		return nomconfirmada;
	}
	public int getCantidad() {
		return cantidad;
	}
	public boolean isConfirmada() {
		return confirmada;
	}
	
	public void setNomconfirmada(String nomconfirmada) {
		this.nomconfirmada = nomconfirmada;
	}
	
}

