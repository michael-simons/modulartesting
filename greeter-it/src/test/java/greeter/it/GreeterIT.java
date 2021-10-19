package greeter.it;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import greeter.Greeter;

import org.junit.jupiter.api.Test;

class GreeterIT {

	@Test
	void greeterShouldWork() {
		assertEquals("Hello, modules.", new Greeter().hello("modules"));
	}

	@Test
	void greeterShouldNotGreetNothing() {

		assertThrows(NullPointerException.class, () -> new Greeter().hello(null));
	}
}
