
public enum TipoPendiente 
{
	ASCENDENTE(1.5),
	DESCENDENTE(0.5);
	
	private double indice;
	
	TipoPendiente(double indice)
	{
		this.setIndice(indice);
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}
	

}
