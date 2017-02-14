package caballeros;

import damas.Mujeres;

public class Calzonazos implements Hombres{

	@Override
	public boolean isDandoMal() {
		return false;
	}

	@Override
	public void cuidan(Mujeres mujer) {
		System.out.println("La cuido como un tesoro");
	}

}
