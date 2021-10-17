package ar.edu.unlam.veterinaria;

public class Pato extends Animal implements Nadar, Volar, Desplazarse {
	private Integer racionDiariaMaximaEnGramos = 350;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals("maizYLombrices") && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}
}
