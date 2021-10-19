package Veterinaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class VeterinariaTest {

	@Test
	public void alIngresarUnAnimalSeCrea() {
		Animal animal = new Animal();
		// assertTrue(animal.pesar());
	}

	@Test
	public void TestQueUnLoroVuela() {
		// Preparacion
		Loro unLoro = new Loro();
		Boolean valorEsperado = true;
		Boolean valorRecibido;
		// Ejecucion
		valorRecibido = unLoro.volar();
		// Contrastacion
		assertEquals(valorEsperado, valorRecibido);

	}
}

