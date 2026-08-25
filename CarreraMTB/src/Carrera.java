import java.util.ArrayList;
public class Carrera 
{
	private ArrayList<Ciclista>ciclistas = new ArrayList<>();
	
	public Carrera()
	{
		
	}
	
	public void agregarCiclista(Ciclista c)
	{
		ciclistas.add(c);
	}
	
	public ArrayList<Ciclista> ciclistasMayorPuntaje()
	{
		ArrayList<Ciclista> mayor = new ArrayList<>();
		for(Ciclista c:ciclistas)
		{
			if(c.sumaPuntajes()> 30)
			{
				mayor.add(c);
			}
		}
		return mayor;
	}
	
	public Ciclista ciclistaMayorTiempo()
	{
		Ciclista mayor = ciclistas.get(0);
		for(Ciclista c:ciclistas)
		{
			if(c.sumaTiempoEstimado()> mayor.sumaTiempoEstimado())
			{
				mayor = c;
			}
		}
		return mayor;
	}
	
	public boolean terminarMenos2Hs()
	{
		for(Ciclista c: ciclistas)
		{
			if(c.hora() > 2)
			{
				return true;
			}
		}
		return false;
	}
	

}
