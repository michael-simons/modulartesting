package app;

import greeter.Greeter;

public class Main {

	public static void main(String... var0) {

		if (!hasArgument(var0)) {
			throw new IllegalArgumentException("Missing name argument.");
		}

		System.out.println((new Greeter()).hello(var0[0]));
	}

	static boolean hasArgument(String... args) {
		return args.length > 0 && !isNullOrBlank(args[0]);
	}

	static boolean isNullOrBlank(String value) {
		return value == null || value.isBlank();
	}
}
