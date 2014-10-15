package habitat.model;

import java.util.List;

/**
 * Definicja Habitatu.
 * @author lzola
 *
 */
public class Habitat {

	private List<ParametryUstawieniaLustra> minimiasta;

	public Habitat(List<ParametryUstawieniaLustra> minimiasta) {
		this.minimiasta = minimiasta;
	}

	public List<ParametryUstawieniaLustra> getMinimiasta() {
		return minimiasta;
	}

	public ParametryUstawieniaLustra getMinimiasto(int i) {
		return minimiasta.get(i);
	}

	public int getLiczbaMinimiast() {
		return minimiasta.size();
	}

	@Override
	public String toString() {
		return "Habitat " + minimiasta;
	}
	
}
