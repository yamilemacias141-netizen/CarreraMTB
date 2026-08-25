
public abstract class Recorrido
{
	protected int distancia;
	
	public Recorrido(int distancia)
	{
		this.distancia=distancia;
		
	}
	
	public abstract double puntaje();
	
	public abstract double tiempoEstimado();
	
	

}
