package damas;

import caballeros.*;

public class Feministas implements Mujeres {

	@Override
	public void todo() {
		System.out.println("Yo puedo hacer de todo");
		
	}

	@Override
	public void isRechazan(Hombres hombre) {
		throw new RuntimeException("No que ");
		
	}

	@Override
	public void emparejan(Hombres hombres) {
		if(hombres instanceof Calzonazos){
			System.out.println();
		}else{
		
		}
		
	}

}
