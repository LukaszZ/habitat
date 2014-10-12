package habitat;

import java.util.Arrays;
import java.util.Collection;

import habitat.builder.HabitatBuilder;
import habitat.exception.DepresjaException;
import habitat.model.Habitat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class HabitatResolverPesimisticTest {
	
	private Habitat habitat;
	
	public HabitatResolverPesimisticTest(Habitat habitat) {
		this.habitat = habitat;
	}

	@Test(expected = DepresjaException.class)
	public void nieUdaSieRozmiescicLusterDepresja() throws DepresjaException {
		//given habitat
		HabitatResolver serviceUnderTest = new HabitatResolver();
		
		//when
		serviceUnderTest.wyliczKosztOptymalnegoUstawieniaLuster(habitat);
		
		//then exception
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				//habitat 1
				{ new HabitatBuilder()
				
				.minimiasto().modyfikujeNaslonecznieni(1)	.kosztUstawienia(7)
				.minimiasto().modyfikujeNaslonecznieni(3)	.kosztUstawienia(3)
				.minimiasto().modyfikujeNaslonecznieni(-2)	.kosztUstawienia(6)
				.minimiasto().modyfikujeNaslonecznieni(-5)	.kosztUstawienia(2)
				
				.build() },
				
				
		});
	}
}
