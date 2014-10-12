package habitat.builder;

import java.util.ArrayList;
import java.util.List;

import habitat.model.Habitat;
import habitat.model.ParametryUstawieniaLustra;

public class HabitatBuilder {

	private List<ParametryUstawieniaLustra> parametry = new ArrayList<ParametryUstawieniaLustra>();

	public ParametryUstawieniaLustraBuilder minimiasto () {
		return new ParametryUstawieniaLustraBuilder(this);
	}
	
	private void dodajParametry(ParametryUstawieniaLustra parametry) {
		this.parametry.add(parametry);
	}
	
	public Habitat build () {
		return new Habitat(parametry);
	}
	
	public class ParametryUstawieniaLustraBuilder {
		
		private HabitatBuilder habitatBuilder;
		
		private int modyfikacjaNaslonecznienia;
		private int koszt;
		
		private ParametryUstawieniaLustraBuilder(HabitatBuilder habitatBuilder) {
			this.habitatBuilder = habitatBuilder;
		}

		public ParametryUstawieniaLustraBuilder modyfikujeNaslonecznieni(int wartosc) {
			this.modyfikacjaNaslonecznienia = wartosc;
			return this;
		}
		
		public HabitatBuilder kosztUstawienia(int koszt) {
			this.koszt = koszt;
			
			habitatBuilder.dodajParametry(new ParametryUstawieniaLustra(this.modyfikacjaNaslonecznienia, this.koszt));
			
			return habitatBuilder;
		}
	}
}
