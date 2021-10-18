package Veterinaria;

class Cliente extends Persona {

	public Cliente(String nombre) {
		super(nombre);
	}
	
	private String dni;
	private Animal mascotas[];
	public String dameDescripcion() {
		String descripcion="Soy un cliente, DNI= " + dni;
		return descripcion;
	} 
}

