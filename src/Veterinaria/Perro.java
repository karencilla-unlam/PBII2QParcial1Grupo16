package Veterinaria;

public class Perro extends Animal implements Locomocion {

	private Integer racionDiariaMaximaEnGramos = 1000;
	private Double metabolizado=75.0;

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
	public Boolean volar(){
		return false;
	}

	@Override
	public Boolean nadar(Perro perro){
		perro.setCansado(true);
		return true;
	}

	@Override
	public Boolean caminar(Perro perro){
		perro.setCansado(true);
		return true;
	}
}
