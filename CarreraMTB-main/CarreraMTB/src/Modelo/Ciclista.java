package Modelo;
import java.util.ArrayList;
public class Ciclista 
{
	private ArrayList<Recorrido> recorridos = new ArrayList<>();
	private int rendimiento;
	
	public Ciclista(int rendimiento)
	{
		this.rendimiento=rendimiento;
	}
	
	public void agregarRecorridos(Recorrido r)
	{
		recorridos.add(r);
	}
	
	public double sumaPuntajes()
	{
		double suma = 0;
		for(Recorrido r: recorridos)
		{
			suma+= r.puntaje();
		}
		return suma;
	}
	
	public double sumaTiempoEstimado()
	{
		double suma = 0;
		for(Recorrido r: recorridos)
		{
			suma += r.tiempoEstimado();
		}
		return suma;
	
	}
	
	public int sumaRecorridos()
	{
		int suma = 0;
		for(Recorrido r: recorridos)
		{
			suma+=r.distancia;
		}
		return suma;
	}
	
	public int hora()
	{
		int calculo = rendimiento/ sumaRecorridos();
		return calculo;

	}
	
	
	

}
