package ar.edu.unlam.veterinaria;

public class Loro extends Animal implements Nadar, Volar, Desplazarse {
	private Integer racionDiariaMaximaEnGramos = 150;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals("semillasYFrutas") && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}
}
