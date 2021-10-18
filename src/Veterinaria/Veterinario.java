package Veterinaria;

class Veterinario extends Persona {
	
	public Veterinario(String nombre) {
	
		super(nombre);
		
	}
	
	private String matricula;
	private String especialidad;
	private String fechaIngreso;
	private Animal pacientes[];
	private Integer valorEcografia=50;
	private Integer valorRadiografia=150;
	private Integer valorLaboratorio=300;
	
	public void hacerEstudio(Estudios estudio, Animal animal) {
			if (estudio.equals(Estudios.ECOGRAFIA)) facturar(valorEcografia, animal);
			else 
				if (estudio.equals(Estudios.RADIOGRAFIA)) facturar(valorRadiografia, animal);
				else facturar(valorLaboratorio, animal);
	}
	
	private void facturar(Integer valorEcografía2, Animal animal) {
		
		//facturar al cliente el estudio realizado a su animal
	}

	
	public String dameDescripcion() {
		String descripcion="Soy un veterinario, matrícula= " + matricula;
		return descripcion;
	}

	public void darTratamiento(Animal animal) {
		Integer tratamiento = 300;
		facturar (tratamiento, animal);
	}

	public void chequeo(Animal animal) {
		Integer chequeo = 500;
		facturar (chequeo, animal);
	}

	public void diagnosticar() {
		
	}

	public void darDeAlta() {
		
	}

	public void sacrificar(Animal animal) {
		//animal.fechaFallecido = hoy();
	}
	
	
}
