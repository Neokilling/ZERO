package objetos.futbol.JugadasPrimitivas;
import lejos.nxt.*;//no sabemos especificamente que vamos a importar pero en este caso los motores
import objetos.futbol.menuconsola.UsuarioUsuario;// IMPORTANTE: Despues de la propuesta de maÃ±ana del MenÃº, determinaremos donde poner 
//y donde calcular la posiciÃ³n del jugador, por lo que veo serÃ¡ mÃ¡s sencillo despÃºes de plantear lo que tengo en mente.

public class Adelantar extends jugadaPrimitiva {
	
	public Adelantar(int potencia, String nombre){
		this.potencia= potencia;
		this.nombre=nombre;
		Motor.A.setSpeed(potencia);
		Motor.B.setSpeed(potencia);//supomenos que asÃ­ se pone la velocidad con respespecto a la potencia
	}
	public void ejecutar(){
		UsuarioUsuario.Cancha1.Memoria_taco=Motor.A.getTachoCount();
		Motor.A.forward();//Derecho=A
		Motor.B.forward();//Izquierdo=B
		//los dos motores hacia adelante
	}
	public void parar(){
		UsuarioUsuario.Cancha1.Delta_taco=Motor.A.getTachoCount()-UsuarioUsuario.Cancha1.Memoria_taco;
		UsuarioUsuario.Cancha1.Fuera_de_posicion=UsuarioUsuario.Cancha1.calcularPosicionJugador();
		UsuarioUsuario.Cancha1.Localizacion_Robot();
		Motor.A.stop();
		Motor.B.stop(); //Metodo que detiene el movimiento del robot
		
	}
}
