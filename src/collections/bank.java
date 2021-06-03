package collections;

public sealed interface bank permits HSBC, ICICI {
	String getName();

}
