package estadosPersonaje;

public abstract class EstadoVikingo {
	
	protected int fuerza;
	protected int defensa;
	
	
	public abstract EstadoVikingo beber();
	public abstract EstadoVikingo esSacudido();
	
	public int getFuerza() {
		return fuerza;
	}
	public int getDefensa() {
		return defensa;
	}
	
}
