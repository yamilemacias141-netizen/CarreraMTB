package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Ciclista;
import Modelo.RecorridoFacil;
import Modelo.RecorridoAvanzado;
class CiclistaTest {

	@Test
	void sumaPuntajeTest_valorEsperado () 
	{
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		c.agregarRecorridos(r);
		
		assertEquals(1 ,c.sumaPuntajes() );
	}
	
	@Test
	void sumaTiempoEstimadoTest_valorEsperado()
	{
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		RecorridoAvanzado r1 = new RecorridoAvanzado(12000, 400);
		c.agregarRecorridos(r);
		c.agregarRecorridos(r1);
		
		double valorEsperado = (12000/30)+((12000/20)*400);
		
		assertEquals(valorEsperado , c.sumaTiempoEstimado());
	}
	
	@Test
	void sumaRecorridosTest_valorEsperado()
	{
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		RecorridoAvanzado r1 = new RecorridoAvanzado(12000, 400);
		c.agregarRecorridos(r);
		c.agregarRecorridos(r1);
		
		assertEquals(24000 , c.sumaRecorridos());
	}
	
	@Test
	void horaTest_valorEsperado()
	{
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		RecorridoAvanzado r1 = new RecorridoAvanzado(12000, 400);
		c.agregarRecorridos(r);
		c.agregarRecorridos(r1);
		
		int valorEsperado = 80/24000;
		assertEquals(valorEsperado , c.hora());
	}

}
