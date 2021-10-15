package EmpWage;

public class Company1 extends EmpWageBuilderUC10 implements Company2 {
	
	int EMP_RATE_PER_HOUR = 20;
	int NUM_OF_WORKING_DAYS = 20;
	int MAX_HRS_IN_MONTH = 100;
	public static String name() {
		String name="TCS";
		return name;
	}
	

}
