package ar.edu.unlam.veterinaria;

public class Perro extends Animal implements Nadar, Volar, Desplazarse {

	private Integer racionDiariaMaximaEnGramos = 1000;
	private Double metabolizado=75.0;

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals("alimentoBalanceadoPerro") && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}
	
	
	public void irDeCuerpo() {
		this.peso-=peso*this.metabolizado/100;
	}
}
