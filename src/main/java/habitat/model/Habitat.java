package habitat.model;

import java.util.ArrayList;
import java.util.List;

public class Habitat {

	private List<ParametryUstawieniaLustra> parametry;

	public Habitat(List<ParametryUstawieniaLustra> parametry) {
		this.parametry = parametry;
	}

	public List<ParametryUstawieniaLustra> getParametry() {
		return parametry;
	}

	public List<ParametryUstawieniaLustra> geCopyOftParametry() {
		return new ArrayList<ParametryUstawieniaLustra>(parametry);
	}
	
	public int getLiczbaMiast() {
		return parametry.size();
	}
}
