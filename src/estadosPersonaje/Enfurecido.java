package estadosPersonaje;

public class Enfurecido extends EstadoVikingo {

	public Enfurecido() {
		this.fuerza = 30;
		this.defensa = 0;
	}

	@Override
	public EstadoVikingo beber() {
		return new Normal();
	}

	@Override
	public EstadoVikingo esSacudido() {
		return new Berserker();
	}

}
