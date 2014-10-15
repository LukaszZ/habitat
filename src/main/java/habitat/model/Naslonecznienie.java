package habitat.model;

public class Naslonecznienie {

	private int naslonecznienie;
	private int koszt;

	public Naslonecznienie() {
	}
	
	private Naslonecznienie(ParametryUstawieniaLustra parametry) {
		modyfikujNaslonecznienie(parametry.getModyfikacjaNaslonecznienia());
		zwiekszKoszt(parametry.getKoszt());
	}

	public int getNaslonecznienie() {
		return naslonecznienie;
	}
	public int getKoszt() {
		return koszt;
	}
	
	public boolean czyIdealne() {
		return this.naslonecznienie == 0;
	}
	
	public static Naslonecznienie wylicz(Naslonecznienie wyliczenie, ParametryUstawieniaLustra parametry) {
		Naslonecznienie wynikWyliczenia = new Naslonecznienie();
		
		wynikWyliczenia.modyfikujNaslonecznienie(wyliczenie.getNaslonecznienie());
		wynikWyliczenia.modyfikujNaslonecznienie(parametry.getModyfikacjaNaslonecznienia());
		
		wynikWyliczenia.zwiekszKoszt(wyliczenie.getKoszt());
		wynikWyliczenia.zwiekszKoszt(parametry.getKoszt());
		
		return wynikWyliczenia;
	}
	
	public static Naslonecznienie dla(ParametryUstawieniaLustra parametry) {
		return new Naslonecznienie(parametry);
	}
	
	public void modyfikujNaslonecznienie(int wartosc) {
		this.naslonecznienie += wartosc;
	}
	
	public void zwiekszKoszt(int koszt) {
		this.koszt += koszt;
	}

	@Override
	public String toString() {
		return "[naslonecznienie=" + naslonecznienie + ", koszt=" + koszt + "]";
	}
	
	
}
