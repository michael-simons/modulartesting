package greeter;

import java.util.Objects;

public class Greeter {

	public String hello(String name) {

		Objects.requireNonNull(name);

		return "Hello, %s.".formatted(name);
	}
}
