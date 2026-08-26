package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.RecorridoFacil;
class RecorridoFacilTest {

	@Test
	void tiempoEstimadoTest_valorEsperado() 
	{
		RecorridoFacil r= new RecorridoFacil(12000);
		double valorEsperado = 12000/30;
		assertEquals(valorEsperado , r.tiempoEstimado());
		
	}
	
	@Test
	void puntajeTest_valorEsperado()
	{
		RecorridoFacil r = new RecorridoFacil(12000);
		double valorEsperado = 1;
		assertEquals(valorEsperado, r.puntaje());
	}

}
