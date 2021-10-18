package Veterinaria;

public class Animal {

	private Integer temperatura;
	protected Double peso;
	private Vitalidad estadoDeSalud;
	private String nombre;
	private String edad;
	private String fechaDeNacimiento;
	private Integer tratamientosRecibidos;
	private Boolean acicalado;
	private Boolean cansado;
	private Double metabolizado;
	

	public Boolean getAcicalado() {
		return acicalado;
	}

	public void setAcicalado(Boolean acicalado) {
		this.acicalado = acicalado;
	}

	public Boolean getCansado() {
		return cansado;
	}

	public void setCansado(Boolean cansado) {
		this.cansado = cansado;
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Vitalidad getEstadoDeSalud() {
		return estadoDeSalud;
	}

	public void setEstadoDeSalud(Vitalidad estadoDeSalud) {
		this.estadoDeSalud = estadoDeSalud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getFehcaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFehcaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Integer getTratamientosRecibidos() {
		return tratamientosRecibidos;
	}

	public void setTratamientosRecibidos(Integer tratamientosRecibidos) {
		this.tratamientosRecibidos = tratamientosRecibidos;
	}

	public Double getMetabolizado() {
		return metabolizado;
	}

	public void setMetabolizado(Double metabolizado) {
		this.metabolizado = metabolizado;
	}

	////////////////////// Métodos//////////////////////////////

	public void comer(Alimento alimento, Integer racion) {
		aumentarPeso(racion);
	}

	public void aumentarPeso(Integer racion) {
		this.peso += racion;
	}

	public void irDeCuerpo() {
		this.peso -= peso * metabolizado / 100;
	}

	public void acicalarse() {
		if (this.acicalado == false) {
			//System.out.println("Este animal NO está acicalado, ahora va a acicalarse un poco para sentirse mejor.");
			this.acicalado = true;
		}
		//System.out.println("Este animal está acicalado. Puede acicalarse en otro momento.");

	}

	public void descansar() {
		if (this.cansado == true) {
			//System.out.println("Este animal está cansado, ahora va a descansar un poco para sentirse mejor.");
			this.cansado = false;
		}
		//System.out.println("Este animal NO está cansado. Puede descansar en otro momento.");

	}
	
}
