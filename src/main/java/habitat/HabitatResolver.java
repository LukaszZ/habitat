package habitat;

import habitat.exception.DepresjaException;
import habitat.model.Habitat;

@FunctionalInterface
public interface HabitatResolver {

	/**
	 * Wylicz minimalny koszt ustawienia luster lub rzuca wyjatek w przypadku depresji.
	 * @param habitat
	 * @return
	 * @throws DepresjaException
	 */
	int wyliczKosztOptymalnegoUstawieniaLuster(Habitat habitat) throws DepresjaException;

}