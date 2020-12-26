package etable.domain.user.model;

public class UserDTO{

	private int cusuario;
	private String nickname;
	private String usnombres;
	private String usapellidos;
	private boolean estado;
	private String tiponombre;
	
	public UserDTO() {
		
	}

	public UserDTO(int cusuario, String nickname, String usnombres, String usapellidos, boolean estado, String tiponombre) {
		super();
		this.cusuario = cusuario;
		this.nickname = nickname;
		this.usnombres = usnombres;
		this.usapellidos = usapellidos;
		this.estado = estado;
		this.tiponombre = tiponombre;
	}

	public int getCusuario() {
		return cusuario;
	}

	public void setCusuario(int cusuario) {
		this.cusuario = cusuario;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsnombres() {
		return usnombres;
	}

	public void setUsnombres(String usnombres) {
		this.usnombres = usnombres;
	}

	public String getUsapellidos() {
		return usapellidos;
	}

	public void setUsapellidos(String usapellidos) {
		this.usapellidos = usapellidos;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getTiponombre() {
		return tiponombre;
	}

	public void setTiponombre(String tiponombre) {
		this.tiponombre = tiponombre;
	}


}
