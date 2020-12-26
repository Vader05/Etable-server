package etable.domain.configuracion.model;

public class Configuracion {

	private int cconfiguracion;
	private int cempresa;
	private String empnombre;
	private String empdescripcion;
	private String empdireccion;
	private String empemail;
	private int empcelular;
	private String emplogo;
	
	private boolean sist_reservacion_cliente;
	private boolean sist_atencion_cliente;
	private boolean mesas_compuestas;
	private boolean agregar_cliente_manual;
	private boolean pagos_tarjeta_credito;
	private boolean reservacion_pedidos;
	private boolean reservas_especiales;
	private boolean reservas_no_sesionadas;
	
	private int cant_max_mesas;
	private int cant_max_us_registrados;
	private String horario_ini_atencion;
	private String horario_fin_atencion;
	private String dias_atencion;
	private int max_us_trab_conectados;
	
	private String date_configurado;
	
	private String imageByte;
	private String imageName;
	
	public Configuracion() {
		
	}
	
	public Configuracion(int cconfiguracion, int cempresa, String empnombre, String empdescripcion, String empdireccion, String empemail,
			int empcelular, String emplogo, boolean sist_reservacion_cliente, boolean sist_atencion_cliente,
			boolean mesas_compuestas, boolean agregar_cliente_manual, boolean pagos_tarjeta_credito,
			boolean reservacion_pedidos, boolean reservas_especiales, boolean reservas_no_sesionadas, String date_configurado) {
		super();
		this.cconfiguracion = cconfiguracion;
		this.cempresa = cempresa;
		this.empnombre = empnombre;
		this.empdescripcion = empdescripcion;
		this.empdireccion = empdireccion;
		this.empemail = empemail;
		this.empcelular = empcelular;
		this.emplogo = emplogo;
		this.sist_reservacion_cliente = sist_reservacion_cliente;
		this.sist_atencion_cliente = sist_atencion_cliente;
		this.mesas_compuestas = mesas_compuestas;
		this.agregar_cliente_manual = agregar_cliente_manual;
		this.pagos_tarjeta_credito = pagos_tarjeta_credito;
		this.reservacion_pedidos = reservacion_pedidos;
		this.reservas_especiales = reservas_especiales;
		this.reservas_no_sesionadas = reservas_no_sesionadas;
		this.date_configurado = date_configurado;
	}
	
	
	public Configuracion(int cant_max_mesas, int cant_max_us_registrados, String horario_ini_atencion, String horario_fin_atencion,
			 String dias_atencion, int max_us_trab_conectados) {
		super();
		this.cant_max_mesas = cant_max_mesas;
		this.cant_max_us_registrados = cant_max_us_registrados;
		this.horario_ini_atencion = horario_ini_atencion;
		this.horario_fin_atencion = horario_fin_atencion;
		this.dias_atencion = dias_atencion;
		this.max_us_trab_conectados = max_us_trab_conectados;
	}

	public int getCant_max_mesas() {
		return cant_max_mesas;
	}

	public void setCant_max_mesas(int cant_max_mesas) {
		this.cant_max_mesas = cant_max_mesas;
	}

	public int getCant_max_us_registrados() {
		return cant_max_us_registrados;
	}

	public void setCant_max_us_registrados(int cant_max_us_registrados) {
		this.cant_max_us_registrados = cant_max_us_registrados;
	}


	public String getHorario_ini_atencion() {
		return horario_ini_atencion;
	}

	public void setHorario_ini_atencion(String horario_ini_atencion) {
		this.horario_ini_atencion = horario_ini_atencion;
	}

	public String getHorario_fin_atencion() {
		return horario_fin_atencion;
	}

	public void setHorario_fin_atencion(String horario_fin_atencion) {
		this.horario_fin_atencion = horario_fin_atencion;
	}

	public String getDias_atencion() {
		return dias_atencion;
	}

	public void setDias_atencion(String dias_atencion) {
		this.dias_atencion = dias_atencion;
	}

	public int getMax_us_trab_conectados() {
		return max_us_trab_conectados;
	}

	public void setMax_us_trab_conectados(int max_us_trab_conectados) {
		this.max_us_trab_conectados = max_us_trab_conectados;
	}


	public String getDate_configurado() {
		return date_configurado;
	}

	public void setDate_configurado(String date_configurado) {
		this.date_configurado = date_configurado;
	}

	public String getEmpdireccion() {
		return empdireccion;
	}

	public void setEmpdireccion(String empdireccion) {
		this.empdireccion = empdireccion;
	}

	public int getCconfiguracion() {
		return cconfiguracion;
	}
	public void setCconfiguracion(int cconfiguracion) {
		this.cconfiguracion = cconfiguracion;
	}
	public int getCempresa() {
		return cempresa;
	}
	public void setCempresa(int cempresa) {
		this.cempresa = cempresa;
	}
	public String getEmpnombre() {
		return empnombre;
	}
	public void setEmpnombre(String empnombre) {
		this.empnombre = empnombre;
	}
	public String getEmpdescripcion() {
		return empdescripcion;
	}
	public void setEmpdescripcion(String empdescripcion) {
		this.empdescripcion = empdescripcion;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public int getEmpcelular() {
		return empcelular;
	}
	public void setEmpcelular(int empcelular) {
		this.empcelular = empcelular;
	}
	public String getEmplogo() {
		return emplogo;
	}
	public void setEmplogo(String emplogo) {
		this.emplogo = emplogo;
	}
	public boolean isSist_reservacion_cliente() {
		return sist_reservacion_cliente;
	}
	public void setSist_reservacion_cliente(boolean sist_reservacion_cliente) {
		this.sist_reservacion_cliente = sist_reservacion_cliente;
	}
	public boolean isSist_atencion_cliente() {
		return sist_atencion_cliente;
	}
	public void setSist_atencion_cliente(boolean sist_atencion_cliente) {
		this.sist_atencion_cliente = sist_atencion_cliente;
	}
	public boolean isMesas_compuestas() {
		return mesas_compuestas;
	}
	public void setMesas_compuestas(boolean mesas_compuestas) {
		this.mesas_compuestas = mesas_compuestas;
	}
	public boolean isAgregar_cliente_manual() {
		return agregar_cliente_manual;
	}
	public void setAgregar_cliente_manual(boolean agregar_cliente_manual) {
		this.agregar_cliente_manual = agregar_cliente_manual;
	}
	public boolean isPagos_tarjeta_credito() {
		return pagos_tarjeta_credito;
	}
	public void setPagos_tarjeta_credito(boolean pagos_tarjeta_credito) {
		this.pagos_tarjeta_credito = pagos_tarjeta_credito;
	}
	public boolean isReservacion_pedidos() {
		return reservacion_pedidos;
	}
	public void setReservacion_pedidos(boolean reservacion_pedidos) {
		this.reservacion_pedidos = reservacion_pedidos;
	}
	public boolean isReservas_especiales() {
		return reservas_especiales;
	}
	public void setReservas_especiales(boolean reservas_especiales) {
		this.reservas_especiales = reservas_especiales;
	}
	public boolean isReservas_no_sesionadas() {
		return reservas_no_sesionadas;
	}
	public void setReservas_no_sesionadas(boolean reservas_no_sesionadas) {
		this.reservas_no_sesionadas = reservas_no_sesionadas;
	}

	public String getImageByte() {
		return imageByte;
	}

	public void setImageByte(String imageByte) {
		this.imageByte = imageByte;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
