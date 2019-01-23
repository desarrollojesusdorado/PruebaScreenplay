package co.com.dejanosllamartebancolombia.screenplay.model;

public class DatosUsuario {
	
	private String nombre;
	private String tipoDocumento;
	private String numeroDocumento;
	private String correo;
	private String pais;
	private String ciudad;
	private String numeroTelefono;
	private String asunto;
	private String tiempoParaContacto;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getTiempoParaContacto() {
		return tiempoParaContacto;
	}
	public void setTiempoParaContacto(String tiempoParaContacto) {
		this.tiempoParaContacto = tiempoParaContacto;
	}
}
