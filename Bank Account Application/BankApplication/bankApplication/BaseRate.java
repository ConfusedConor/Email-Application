package bankApplication;

public interface BaseRate {
	// A method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}
}