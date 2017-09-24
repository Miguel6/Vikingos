package personaje;

import estadosPersonaje.EstadoVikingo;
import estadosPersonaje.Normal;

public class Vikingo {

	private int salud = 100;
	private EstadoVikingo estado = new Normal();

	public void atacaA(Vikingo atacado) {
		if (atacado.salud > 0)
			atacado.esAtacado(this.estado.getFuerza());
	}

	public void esAtacado(int dañoRecibido) {
		this.salud -= dañoRecibido - this.estado.getDefensa();
	}

	public void beber() {
		this.estado = this.estado.beber();
	}

	public void esSacudido() {
		this.estado = this.estado.esSacudido();
	}

	public int getSalud() {
		return salud;
	}
}
