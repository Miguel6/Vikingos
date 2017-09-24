package estadosPersonaje;

public class Normal extends EstadoVikingo{

	public Normal(){
		this.fuerza = 10;
		this.defensa = 5;
	}
	
	public EstadoVikingo beber() {
		
		return new Ebrio();
	}

	
	public EstadoVikingo esSacudido() {
		
		return new Enfurecido();
	}

	
}
