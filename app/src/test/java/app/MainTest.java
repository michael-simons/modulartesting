package app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

	@Test
	void isNullOrBlankShouldDetectNullString() {
		assertTrue(Main.isNullOrBlank(null));
	}

	@ParameterizedTest
	@ValueSource(strings = { "", " ", "  \t " })
	void isNullOrBlankShouldDetectBlankStrings(String value) {
		assertTrue(Main.isNullOrBlank(value));
	}

	@ParameterizedTest
	@ValueSource(strings = { "bar", "  foo \t " })
	void isNullOrBlankShouldWorkWithNonBlankStrings(String value) {
		assertFalse(Main.isNullOrBlank(value));
	}
}