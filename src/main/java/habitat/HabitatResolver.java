package habitat;

import java.util.List;

import habitat.exception.DepresjaException;
import habitat.model.Habitat;
import habitat.model.ParametryUstawieniaLustra;
import habitat.model.WynikWyliczenia;

public class HabitatResolver {

	public int wyliczKosztOptymalnegoUstawieniaLuster(Habitat habitat) throws DepresjaException {
		
		WynikWyliczenia idealnyWynik = null;
		
		for (int i = 0; i < habitat.getLiczbaMiast(); i++) {
			
			ParametryUstawieniaLustra param = habitat.getParametry().get(i);
			
			WynikWyliczenia wynikWyliczenia = new WynikWyliczenia(param);
			
			List<ParametryUstawieniaLustra> copyOfParametry = habitat.getCopyOfParametry();
			copyOfParametry.remove(param);
			
			WynikWyliczenia nowyWynik = wyliczKosztUstawienia(wynikWyliczenia, copyOfParametry);
			
			if (idealnyWynik == null) {
				idealnyWynik = nowyWynik;
			}
			
			if (idealnyWynik.czyIdealneNaslonecznienie() && nowyWynik.czyIdealneNaslonecznienie()) {
				if (idealnyWynik.getKoszt() > nowyWynik.getKoszt()) {
					idealnyWynik = nowyWynik;
				}
			} else if (idealnyWynik.czyIdealneNaslonecznienie() && !nowyWynik.czyIdealneNaslonecznienie()) {
				//nic
			} else if (!idealnyWynik.czyIdealneNaslonecznienie() && nowyWynik.czyIdealneNaslonecznienie()) {
				idealnyWynik = nowyWynik;
			} else { //wszystko nie idealne olewka
				//nic
			}
		}
		
		if (!idealnyWynik.czyIdealneNaslonecznienie() ) {
			throw new DepresjaException();
		}
		
		return idealnyWynik.getKoszt();
	}
	
	private WynikWyliczenia wyliczKosztUstawienia(WynikWyliczenia wynik, List<ParametryUstawieniaLustra> parametry) {
		if (parametry.size() > 1 ) {
			ParametryUstawieniaLustra param = parametry.iterator().next();
			parametry.remove(param);
			
			
			WynikWyliczenia noweWyliczenie = wyliczKosztUstawienia(wynik, parametry);
			
			if (noweWyliczenie.czyIdealneNaslonecznienie()) {				
				return noweWyliczenie;			
			}
			
			noweWyliczenie.uwzglednijParametry(param);
			
			return noweWyliczenie;
		} else {  //if (parametry.size() == 1) 
		
			ParametryUstawieniaLustra param = parametry.iterator().next();
			return new WynikWyliczenia(param);
		}
	}
}
