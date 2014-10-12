package habitat.model;

/**
 * Parametry ustawienia lustra w miejscowosci w ramach Habitatu
 * @author lzola
 *
 */
public class ParametryUstawieniaLustra {

	private int modyfikacjaNaslonecznienia;
	private int koszt;
	
	public ParametryUstawieniaLustra(int modyfikacjaNaslonecznienia, int koszt) {
		this.modyfikacjaNaslonecznienia = modyfikacjaNaslonecznienia;
		this.koszt = koszt;
	}
	
	public int getModyfikacjaNaslonecznienia() {
		return modyfikacjaNaslonecznienia;
	}
	
	public int getKoszt() {
		return koszt;
	}
	
	
}
