
public class RecorridoAvanzado extends Recorrido
{
	private int obstaculo;
	
	public RecorridoAvanzado(int distancia, int obstaculo) {
		super(distancia);
		this.obstaculo=obstaculo;
	}
	
	public double tiempoEstimado()
	{
		double tiempo = (distancia/20)* obstaculo;
		return tiempo;
	}
	
	public double puntaje()
	{
		double punto = 0.5*distancia;
		return punto;
	}

	
	
	

}
