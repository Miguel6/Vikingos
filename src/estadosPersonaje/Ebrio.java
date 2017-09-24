package estadosPersonaje;

public class Ebrio extends EstadoVikingo {
	
	public Ebrio(){
		this.fuerza = 7;
		this.defensa = 2;
	}
	
	@Override
	public EstadoVikingo beber() {
		return this;
	}

	@Override
	public EstadoVikingo esSacudido() {
		return new Normal();
	}

}
