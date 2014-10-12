package habitat;

import static org.fest.assertions.Assertions.assertThat;

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
public class HabitatResolverOptimisticTest {

	private Habitat habitat;
	private int oczekiwanykoszt;
	
	public HabitatResolverOptimisticTest(Habitat habitat, int oczekiwanykoszt) {
		this.habitat = habitat;
		this.oczekiwanykoszt = oczekiwanykoszt;
	}

	@Test
	public void powinienWyznaczycOptymalnyKoszt() throws DepresjaException {
		//given
		HabitatResolver serviceUnderTest = new HabitatResolver();

		//when
		int kosztUstawienia = serviceUnderTest.wyliczKosztOptymalnegoUstawieniaLuster(habitat);
		
		//then
		assertThat(kosztUstawienia).isEqualTo(oczekiwanykoszt);
	}
	
	@Parameters(name = "{index}: {0}  minimalnyKoszt -> {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				//habitat 1
				{new HabitatBuilder()
				
				.minimiasto().modyfikujeNaslonecznieni(3)	.kosztUstawienia(3)
				.minimiasto().modyfikujeNaslonecznieni(7)	.kosztUstawienia(3)
				.minimiasto().modyfikujeNaslonecznieni(-10)	.kosztUstawienia(2)
				.minimiasto().modyfikujeNaslonecznieni(10)	.kosztUstawienia(9)
				
				.build(),  8},
				//habitat 2
				{new HabitatBuilder()
				
				.minimiasto().modyfikujeNaslonecznieni(-10)	.kosztUstawienia(2)
				.minimiasto().modyfikujeNaslonecznieni(3)	.kosztUstawienia(3)
				.minimiasto().modyfikujeNaslonecznieni(10)	.kosztUstawienia(9)
				.minimiasto().modyfikujeNaslonecznieni(7)	.kosztUstawienia(3)
				
				.build(), 8}
		});
	}
}
