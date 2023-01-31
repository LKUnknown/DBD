package clases;

public class Ruleta {
	
	private String Reto;
	private Personajes Personaje;
	private Mapas Map;
	private Jugadores Jugador;
	
	public Ruleta (String Reto) {
		this.Reto = Reto;
		this.Personaje = null;
		this.Map = null;
		this.Jugador = null;
	}
	
	public Ruleta(String Reto, Personajes Personaje) {
		this.Reto = Reto;
		this.Personaje = Personaje;
		this.Map = null;
		this.Jugador = null;
	}
	
	public Ruleta(String Reto, Mapas Map) {
		this.Reto = Reto;
		this.Personaje = null;
		this.Map = Map;
		this.Jugador = null;
	}
	
	public Ruleta(String Reto, Jugadores Jugador) {
		this.Reto = Reto;
		this.Personaje = null;
		this.Map = null;
		this.Jugador = Jugador;
	}

	public String getReto() {
		return Reto;
	}

	public void setReto(String reto) {
		Reto = reto;
	}

	public Personajes getPersonaje() {
		return Personaje;
	}

	public void setPersonaje(Personajes personaje) {
		Personaje = personaje;
	}

	public Mapas getMap() {
		return Map;
	}

	public void setMap(Mapas map) {
		Map = map;
	}

	
	public String toString() {
		return "Reto: " + Reto + "\n Personaje: " + Personaje + "\n Mapa: " + Map + "\n Jugador: " + Jugador;
	}
	
	

}
