package bankApplication;

public interface BaseRate {
	static double baseRate = 1.0;
	

	public static double getBaseRate(){
		return baseRate;
	}
}