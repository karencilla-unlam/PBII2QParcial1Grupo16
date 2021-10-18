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
	
	@Override
	public Boolean volar(Loro loro){
		loro.setCansado(true);
		return true;
	}
	
	@Override
	public Boolean nadar(){
		return false;
	}
	
	@Override
	public Boolean caminar(Loro loro){
		loro.setCansado(true);
		return true;
	}

	}
}
