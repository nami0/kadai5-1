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
	@Test
	public void translateEngで117がone_hundred_seventeenになる() {
		String expected = "one hundred seventeen";
		String actual = IntToEng.translateEng(117);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで30がthirtyになる() {
		String expected = "thirty";
		String actual = IntToEng.translateEng(30);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで103がone_hundred_threeになる() {
		String expected = "one hundred three";
		String actual = IntToEng.translateEng(103);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで823がeight_hundred_twenty_threeになる() {
		String expected = "eight hundred twenty three";
		String actual = IntToEng.translateEng(823);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで999がnine_hundred_ninety_nineになる() {
		String expected = "nine hundred ninety nine";
		String actual = IntToEng.translateEng(999);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで959がnine_hundred_fifty_nineになる() {
		String expected = "nine hundred fifty nine";
		String actual = IntToEng.translateEng(959);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで1032がone_thousand_thirty_twoになる() {
		String expected = "one thousand thirty two";
		String actual = IntToEng.translateEng(1032);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで1000がone_thousandになる() {
		String expected = "one thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで1777がone_thousand_seven_hundred_seventy_sevenになる() {
		String expected = "one thousand seven hundred seventy seven";
		String actual = IntToEng.translateEng(1777);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで9999がnine_thousand_nine_hundred_nienty_nineになる() {
		String expected = "nine thousand nine hundred ninety nine";
		String actual = IntToEng.translateEng(9999);
		assertThat(actual,is(expected));
	}
}
