
public class RecorridoIntermedio extends Recorrido
{
	private TipoPendiente pendiente;
	
	public RecorridoIntermedio(int distancia, TipoPendiente pendinete) {
		super(distancia);
		this.pendiente=pendiente;
	}
	
	public double tiempoEstimado()
	{
		double tiempo = (distancia/25)*pendiente.getIndice();
		return tiempo;
	}
	
	public double puntaje()
	{
		double punto = 1+ pendiente.getIndice();
		return punto;
	}
	

}
