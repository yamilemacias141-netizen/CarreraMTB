package Modelo;

public enum TipoPendiente 
{
	ASCENDENTE(1.5f),
	DESCENDENTE(0.5f);
	
	private double indice;
	
	TipoPendiente(double indice)
	{
		this.indice = indice;
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}
	

}
