package caballeros;

import damas.*;

public class Adonis extends Machistas {
	
	@Override
	public boolean isDandoMal() {
		return false;
	}
	
	@Override
	public void cuidan(Mujeres mujeres) {
		if(mujeres instanceof Princesas){
			System.out.println("La cuido");
		}else{
			super.cuidan(mujeres);
		}
	}

}
