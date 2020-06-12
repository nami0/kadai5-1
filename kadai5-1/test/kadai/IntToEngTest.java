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
	@Test
	public void translateEngで21がtwenty_oneになる() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで99がninety_nineになる() {
		String expected = "ninety nine";
		String actual = IntToEng.translateEng(99);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで100がone_hundredになる() {
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
}
