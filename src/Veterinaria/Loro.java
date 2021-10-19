package Veterinaria;

public class Loro extends Animal implements Locomocion {
	private Integer racionDiariaMaximaEnGramos = 150;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals(Alimento.SEMILLAS_FRUTAS) && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}
	}

	@Override
	public Boolean volar() {
		this.cansado = true;
		return cansado;
	}

	@Override
	public Boolean nadar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean caminar() {
		this.cansado = true;
		return cansado;
	}
}
