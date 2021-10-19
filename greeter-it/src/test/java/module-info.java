module greeter.it {

	requires greeter;
	requires org.junit.jupiter;

	opens greeter.it to org.junit.platform.commons;
}