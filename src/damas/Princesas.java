package damas;

import caballeros.*;

public class Princesas implements Mujeres {

	@Override
	public void todo() {		
		throw new RuntimeException("Soy incapaz de hacer todo");
	}

	@Override
	public void isRechazan(Hombres hombre) {
		if (hombre instanceof Adonis){
		}else{
			throw new RuntimeException();
		}
		
	}

	@Override
	public void emparejan(Hombres hombre) {
		// TODO Auto-generated method stub
		
	}

}
