package etable.domain.user.model;

public class User {

	private static User instance;
	private int cusuario;
	private String nickname;
	private String password;
	private String usnombres;
	private String usapellidos;
	private boolean estado;
	private int ctipousuario;

	public User() {

	}

	public User(int cusuario, String nickname, String usnombres, String usapellidos, boolean estado, int ctipousuario) {
		super();
		this.cusuario = cusuario;
		this.nickname = nickname;
		this.usnombres = usnombres;
		this.usapellidos = usapellidos;
		this.estado = estado;
		this.ctipousuario = ctipousuario;
	}

	public User(int cusuario, String nickname, String password, String usnombres, String usapellidos, boolean estado,
			int ctipousuario) {
		super();
		this.cusuario = cusuario;
		this.nickname = nickname;
		this.password = password;
		this.usnombres = usnombres;
		this.usapellidos = usapellidos;
		this.estado = estado;
		this.ctipousuario = ctipousuario;
	}

	public String getPassword() {
		return password;
	}
	
	public int getCusuario() {
		return cusuario;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCusuario(int cusuario) {
		this.cusuario = cusuario;
	}
	
	public void setUsnombres(String usnombres) {
		this.usnombres = usnombres;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public boolean isEstado() {
		return estado;
	}

	public String getUsnombres() {
		return usnombres;
	}

	public void setCtipousuario(int ctipousuario) {
		this.ctipousuario = ctipousuario;
	}

	public void setUsapellidos(String usapellidos) {
		this.usapellidos = usapellidos;
	}
	
	public int getCtipousuario() {
		return ctipousuario;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getUsapellidos() {
		return usapellidos;
	}

	
	@Override
	public String toString() {
		return "User [cusuario=" + cusuario + ", nickname=" + nickname + ", password=" + password + ", usnombres="
				+ usnombres + ", usapellidos=" + usapellidos + ", estado=" + estado + ", ctipousuario=" + ctipousuario
				+ "]";
	}

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	public void setter(int cusuario, String nickname, String password, String usnombres,
			String usapellidos, boolean estado, int ctipousuario) {
		this.setCtipousuario(ctipousuario);
		this.setCusuario(cusuario);
		this.setNickname(nickname);
		this.setPassword(password);
		this.setUsnombres(usnombres);
		this.setUsapellidos(usapellidos);
		this.setEstado(estado);
	}

	public static User getInstancia(int cusuario, String nickname, String password, String usnombres,
			String usapellidos, boolean estado, int ctipousuario) {
		if (instance == null) {
			instance = (builder().buildCodigo(cusuario).buildNickname(nickname).buildPassword(password)
					.buildNombres(usnombres).buildApellidos(usapellidos).buildEstado(estado)
					.buildCodigoTipoUsuario(ctipousuario)).build();

		} else {
			instance.setter(cusuario, nickname, password, usnombres, usapellidos, estado, ctipousuario);
		}
		return instance;
	}

	public static class UserBuilder {

		private int cusuario;
		private String nickname;
		private String password;
		private String usnombres;
		private String usapellidos;
		private boolean estado;
		private int ctipousuario;
		
		
		public UserBuilder buildCodigo(int cusuario) {
			this.cusuario = cusuario;
			return this;
		}
		
		public UserBuilder buildNickname(String nickname) {
			this.nickname = nickname;
			return this;
		}
		
		public UserBuilder buildPassword(String password) {
			this.password = password;
			return this;
		}
		
		public UserBuilder buildNombres(String usnombres) {
			this.usnombres = usnombres;
			return this;
		}
		
		public UserBuilder buildApellidos(String apellidos) {
			this.usapellidos = apellidos;
			return this;
		}
		
		public UserBuilder buildEstado(boolean estado) {
			this.estado = estado;
			return this;
		}
		
		public UserBuilder buildCodigoTipoUsuario(int ctipo) {
			this.ctipousuario = ctipo;
			return this;
		}
		
		public User build() {
			return new User(cusuario, nickname, password, usnombres, usapellidos, estado, ctipousuario);
		}
		
	}
}
