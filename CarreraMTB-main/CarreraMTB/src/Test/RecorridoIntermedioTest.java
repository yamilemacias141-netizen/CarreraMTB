package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.RecorridoIntermedio;
import Modelo.TipoPendiente;
class RecorridoIntermedioTest {

	@Test
	void tiempoEstimadoTest_valorEsperado() 
	{
		RecorridoIntermedio r = new RecorridoIntermedio(12000, TipoPendiente.ASCENDENTE);
		double valorEsperado = (12000/25)*1.5f;
		assertEquals(valorEsperado , r.tiempoEstimado());
		
	}
	
	@Test
	void puntajeTets_valorEsperado()
	{
		RecorridoIntermedio r = new RecorridoIntermedio(12000, TipoPendiente.ASCENDENTE);
		double valorEsperado = 1 + 1.5f;
		assertEquals(valorEsperado , r.puntaje());
	}

}
