package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Modelo.Carrera;
import Modelo.Ciclista;
import Modelo.RecorridoFacil;

class CarreraTest {

	@Test
	void ciclistasMayprPuntaje() 
	{
		Carrera ca = new Carrera();
		
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		c.agregarRecorridos(r);
		ca.agregarCiclista(c);
		ArrayList<Ciclista> valorEsperado = new ArrayList<>();
		assertEquals(valorEsperado , ca.ciclistasMayorPuntaje() );
	}
	
	@Test
	void ciclistaMayorTiempoTest_valorEsperado()
	{
        Carrera ca = new Carrera();
		
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		c.agregarRecorridos(r);
		ca.agregarCiclista(c);
		Ciclista valorEsperado = c;
		assertEquals(valorEsperado, ca.ciclistaMayorTiempo());
	}
	
	@Test
	void terminarMenos2hsTest_true()
	{
        Carrera ca = new Carrera();
		
		Ciclista c = new Ciclista(80);
		RecorridoFacil r = new RecorridoFacil(12000);
		c.agregarRecorridos(r);
		ca.agregarCiclista(c);
		assertEquals(true , ca.terminarMenos2Hs());
		
		assertEquals(true , ca.terminarMenos2Hs());
	}

}
