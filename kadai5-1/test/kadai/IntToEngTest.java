package kadai;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEngで0がzeroになる() {
		String expected = "zero";
		String actual = IntToEng.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで1がoneになる() {
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで11がelevenになる() {
		String expected = "eleven";
		String actual = IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}

}
