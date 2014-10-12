package habitat.model;

public class WynikWyliczenia {

	private int naslonecznienie = 0;
	private int koszt = 0;

	public WynikWyliczenia(ParametryUstawieniaLustra parametry) {
		uwzglednijParametry(parametry);
	}

	public int getNaslonecznienie() {
		return naslonecznienie;
	}
	public int getKoszt() {
		return koszt;
	}
	
	public boolean czyIdealneNaslonecznienie() {
		return this.naslonecznienie == 0;
	}
	
	public void uwzglednijParametry(ParametryUstawieniaLustra parametry) {
		modyfikujNaslonecznienie(parametry.getModyfikacjaNaslonecznienia());
		zwiekszKoszt(parametry.getKoszt());
	}
	
	public void modyfikujNaslonecznienie(int wartosc) {
		this.naslonecznienie += wartosc;
	}
	
	public void zwiekszKoszt(int koszt) {
		this.koszt += koszt;
	}
	
}
