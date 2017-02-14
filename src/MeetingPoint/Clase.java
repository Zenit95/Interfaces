package MeetingPoint;

import java.util.List;

import caballeros.Hombres;
import damas.Mujeres;

public class Clase implements PuntoReunion{
	
	public void reunen(List<Hombres> hombres, List<Mujeres> mujeres){
		for(Mujeres mujer:mujeres){
			for(Hombres hombre:hombres){
				if(!hombre.isDandoMal()){
					mujer.emparejan(hombre);
					hombre.cuidan(mujer);
				}
			}
		}
	}

}
