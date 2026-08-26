package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.RecorridoAvanzado;
class RecorridoAvanzadoTest {

	@Test
	void tiempoEstimadoTest_valorEsperado() 
	{
		RecorridoAvanzado r = new RecorridoAvanzado(12000, 400);
		double valorEsperado = 12000/20 * 400;
		assertEquals(valorEsperado , r.tiempoEstimado());
	}
	
	@Test
	void puntajeTest_valorEsperado()
	{
		RecorridoAvanzado r = new RecorridoAvanzado(12000, 400);
		double valorEsperado = 0.5*12000;
		assertEquals(valorEsperado , r.puntaje());
	}

}
