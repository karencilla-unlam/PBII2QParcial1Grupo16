package Veterinaria;

public class Pato extends Animal implements Locomocion {
	private Integer racionDiariaMaximaEnGramos = 350;

	@Override
	public void comer(Alimento alimento, Integer racion) {
		if (alimento.equals(Alimento.MAIZ_LOMBRICES) && racion < this.racionDiariaMaximaEnGramos) {
			aumentarPeso(racion);
		} else {
			System.out.println("Racion diaria excedida");
		}

	@Override
	public Boolean volar(Pato pato){
		pato.setCansado(true);
		return true;
	}
		
	@Override
	public Boolean nadar(Pato pato){
		pato.setCansado(true);
		return true;
	}
		
	@Override
	public Boolean caminar(Pato pato){
		pato.setCansado(true);
		return true;
	}
	}
}
