package Modelo;

public class RecorridoFacil extends Recorrido
{

	public RecorridoFacil(int distancia) {
		super(distancia);
		
	}
	
	public double tiempoEstimado()
	{
		double tiempo = distancia/30;
		return tiempo;
	}
	
	public double puntaje()
	{
		double punto = 1;
		return punto;
	}

}
