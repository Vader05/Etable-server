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
	
	private boolean sistReservacionCliente;
	private boolean sistAtencionCliente;
	private boolean mesasCompuestas;
	private boolean agregarClienteManual;
	private boolean pagosTarjetaCredito;
	private boolean reservacionPedidos;
	private boolean reservasEspeciales;
	private boolean reservasNoSesionadas;
	
	private int cantMaxMesas;
	private int cantMaxUsRegistrados;
	private String horarioIniAtencion;
	private String horarioFinAtencion;
	private String diasAtencion;
	private int maxUsTrabConectados;
	
	private String dateConfigurado;
	
	private String imageByte;
	private String imageName;
	
	public Configuracion() {
		
	}
	
	public Configuracion(int cconfiguracion, int cempresa, String empnombre, String empdescripcion, String empdireccion, String empemail,
			int empcelular, String emplogo, boolean sistReservacionCliente, boolean sistAtencionCliente,
			boolean mesasCompuestas, boolean agregarClienteManual, boolean pagosTarjetaCredito,
			boolean reservacionPedidos, boolean reservasEspeciales, boolean reservasNoSesionadas, String dateConfigurado) {
		super();
		this.cconfiguracion = cconfiguracion;
		this.cempresa = cempresa;
		this.empnombre = empnombre;
		this.empdescripcion = empdescripcion;
		this.empdireccion = empdireccion;
		this.empemail = empemail;
		this.empcelular = empcelular;
		this.emplogo = emplogo;
		this.sistReservacionCliente = sistReservacionCliente;
		this.sistAtencionCliente = sistAtencionCliente;
		this.mesasCompuestas = mesasCompuestas;
		this.agregarClienteManual = agregarClienteManual;
		this.pagosTarjetaCredito = pagosTarjetaCredito;
		this.reservacionPedidos = reservacionPedidos;
		this.reservasEspeciales = reservasEspeciales;
		this.reservasNoSesionadas = reservasNoSesionadas;
		this.dateConfigurado = dateConfigurado;
	}
	
	
	public Configuracion(int cantMaxMesas, int cantMaxUsRegistrados, String horarioIniAtencion, String horarioFinAtencion,
			 String diasAtencion, int maxUsTrabConectados) {
		super();
		this.cantMaxMesas = cantMaxMesas;
		this.cantMaxUsRegistrados = cantMaxUsRegistrados;
		this.horarioIniAtencion = horarioIniAtencion;
		this.horarioFinAtencion = horarioFinAtencion;
		this.diasAtencion = diasAtencion;
		this.maxUsTrabConectados = maxUsTrabConectados;
	}

	public int getcantMaxMesas() {
		return cantMaxMesas;
	}

	public void setcantMaxMesas(int cantMaxMesas) {
		this.cantMaxMesas = cantMaxMesas;
	}

	public int getcantMaxUsRegistrados() {
		return cantMaxUsRegistrados;
	}

	public void setcantMaxUsRegistrados(int cantMaxUsRegistrados) {
		this.cantMaxUsRegistrados = cantMaxUsRegistrados;
	}


	public String gethorarioIniAtencion() {
		return horarioIniAtencion;
	}

	public void sethorarioIniAtencion(String horarioIniAtencion) {
		this.horarioIniAtencion = horarioIniAtencion;
	}

	public String gethorarioFinAtencion() {
		return horarioFinAtencion;
	}

	public void sethorarioFinAtencion(String horarioFinAtencion) {
		this.horarioFinAtencion = horarioFinAtencion;
	}

	public String getdiasAtencion() {
		return diasAtencion;
	}

	public void setdiasAtencion(String diasAtencion) {
		this.diasAtencion = diasAtencion;
	}

	public int getmaxUsTrabConectados() {
		return maxUsTrabConectados;
	}

	public void setmaxUsTrabConectados(int maxUsTrabConectados) {
		this.maxUsTrabConectados = maxUsTrabConectados;
	}


	public String getdateConfigurado() {
		return dateConfigurado;
	}

	public void setdateConfigurado(String dateConfigurado) {
		this.dateConfigurado = dateConfigurado;
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
	public boolean issistReservacionCliente() {
		return sistReservacionCliente;
	}
	public void setsistReservacionCliente(boolean sistReservacionCliente) {
		this.sistReservacionCliente = sistReservacionCliente;
	}
	public boolean issistAtencionCliente() {
		return sistAtencionCliente;
	}
	public void setsistAtencionCliente(boolean sistAtencionCliente) {
		this.sistAtencionCliente = sistAtencionCliente;
	}
	public boolean ismesasCompuestas() {
		return mesasCompuestas;
	}
	public void setmesasCompuestas(boolean mesasCompuestas) {
		this.mesasCompuestas = mesasCompuestas;
	}
	public boolean isagregarClienteManual() {
		return agregarClienteManual;
	}
	public void setagregarClienteManual(boolean agregarClienteManual) {
		this.agregarClienteManual = agregarClienteManual;
	}
	public boolean ispagosTarjetaCredito() {
		return pagosTarjetaCredito;
	}
	public void setpagosTarjetaCredito(boolean pagosTarjetaCredito) {
		this.pagosTarjetaCredito = pagosTarjetaCredito;
	}
	public boolean isreservacionPedidos() {
		return reservacionPedidos;
	}
	public void setreservacionPedidos(boolean reservacionPedidos) {
		this.reservacionPedidos = reservacionPedidos;
	}
	public boolean isreservasEspeciales() {
		return reservasEspeciales;
	}
	public void setreservasEspeciales(boolean reservasEspeciales) {
		this.reservasEspeciales = reservasEspeciales;
	}
	public boolean isreservasNoSesionadas() {
		return reservasNoSesionadas;
	}
	public void setreservasNoSesionadas(boolean reservasNoSesionadas) {
		this.reservasNoSesionadas = reservasNoSesionadas;
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
