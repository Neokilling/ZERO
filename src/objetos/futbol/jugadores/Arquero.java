package objetos.futbol.jugadores;

import java.io.Serializable;
import java.util.ArrayList;

//EDITABLE, AUN NO SABEMOS DONDE ESTÃ�N LOS MOTORES DEL ROBOT.
public class Arquero extends Futbolista implements Serializable{
	private long TiempoSinGoles;
	private byte dorsal;
	public Arquero(String nombre, String posicion, ArrayList<JugadaCompleja> listaJugadas, 
			 long TiempoSinGoles, byte dorsal){
		super(nombre,posicion,listaJugadas); //Invocamos al constructor de la superclase
		this.TiempoSinGoles=TiempoSinGoles;
		this.dorsal=dorsal;
	}
	public String getInformacion(){
		return super.toString()+" con el dorsal"+ this.dorsal +" Tiempo sin Goles "+
	this.TiempoSinGoles; //no se sobre escribe el metodo ToString de la superClase
	}
	public long getTiempoSinGoles(){
		return this.TiempoSinGoles;
	}
	public void setTiempoSinGoles(long tiempo){
		TiempoSinGoles= tiempo;
	}

}

