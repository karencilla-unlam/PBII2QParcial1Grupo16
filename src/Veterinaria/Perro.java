package Veterinaria;

public class Perro extends Animal implements Locomocion {

	private Integer racionDiariaMaximaEnGramos = 1000;
	private Double metabolizado = 75.0;

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals(Alimento.ALIMENTO_BALANCEADO_PERRO) && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	}

	@Override
	public Boolean volar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean nadar() {
		this.cansado = true;
		return cansado;
	}

	@Override
	public Boolean caminar() {
		this.cansado = true;
		return cansado;
	}
}
