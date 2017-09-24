package estadosPersonaje;

public class Berserker extends EstadoVikingo {

	public Berserker() {
		this.fuerza = 80;
		this.defensa = -10;
	}
	
	@Override
	public EstadoVikingo beber() {		
		return new Ebrio();
	}

	@Override
	public EstadoVikingo esSacudido() {
		return this;
	}

}
