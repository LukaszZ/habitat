package habitat;

import habitat.exception.DepresjaException;
import habitat.model.Habitat;
import habitat.model.Naslonecznienie;

public class DefaultHabitatResolver implements HabitatResolver {
	
	private int minimalnyKoszt = Integer.MAX_VALUE;
	
	/* (non-Javadoc)
	 * @see habitat.HabitatResolver#wyliczKosztOptymalnegoUstawieniaLuster(habitat.model.Habitat)
	 */
	public int wyliczKosztOptymalnegoUstawieniaLuster(Habitat habitat) throws DepresjaException {
		
		for (int poziom = 0; poziom < habitat.getLiczbaMinimiast(); poziom++) {
			wyliczKoszt(habitat, poziom, Naslonecznienie.dla(habitat.getMinimiasto(poziom)));
		}
		
		if (Integer.MAX_VALUE == minimalnyKoszt) {
			throw new DepresjaException();
		}
		
		return minimalnyKoszt;
	}
	
	private void wyliczKoszt (Habitat habitat, int poziom, Naslonecznienie naslonecznienie) {

		if (poziom == habitat.getLiczbaMinimiast() - 1 ) {
			if (naslonecznienie.czyIdealne() && minimalnyKoszt > naslonecznienie.getKoszt()) {
				minimalnyKoszt = naslonecznienie.getKoszt();
			}
		} else {
			int kolejnyPoziom = poziom+1;
			
			wyliczKoszt(habitat, kolejnyPoziom, naslonecznienie);		
			wyliczKoszt(habitat, kolejnyPoziom, Naslonecznienie.wylicz(naslonecznienie, habitat.getMinimiasto(kolejnyPoziom)));
		}
		
	}
}
