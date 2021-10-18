package Veterinaria;

public class Pato extends Animal implements Nadar, Volar, Desplazarse {
	private Integer racionDiariaMaximaEnGramos = 350;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals(Alimento.MAIZ_LOMBRICES) && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}
}
