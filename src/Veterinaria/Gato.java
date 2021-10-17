package Veterinaria;

public class Gato extends Animal implements Nadar, Volar, Desplazarse {
	private Integer racionDiariaMaximaEnGramos = 750;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals(Alimento.ALIMENTO_BALANCEADO_GATO) && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}
}
