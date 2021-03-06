
package bridgelabz.sweetshop;

import java.util.ArrayList;

public class EmpWageBuilderUC11 {
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    	
	private static int getTotalEmpWage(int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
	 
		int empHrs =0, totalEmpHrs=0, totalWorkingDays =0;
  
	while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
     totalWorkingDays++;
     int empCheck = (int)Math.round((Math.random() *10) % 3);
     
	 switch (empCheck)
     {
				case IS_FULL_TIME:
						empHrs=8;
						break;
				case IS_PART_TIME:
						empHrs=4;
						break;
				default:
						empHrs=0;
		}
		totalEmpHrs += empHrs;
		//System.out.println("day:" + totalWorkingDays +" " + "Emp hr: " +empHrs);
	}
	
	int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	//System.out.println("Total Employee Wage: " + totalEmpWage);
	return totalEmpWage;
}


        public static void main(String args[]) {
        	
        	System.out.println( "Welcome to Employee Wage Computation Program");
        	
        	ArrayList<Integer> list = new ArrayList<Integer>();
    		list.add(getTotalEmpWage(20,20,100));
    		list.add(getTotalEmpWage(20,22,90));
		
			for(Integer salary:list)
			System.out.println("Total Wage for each Company :" + salary);
               
		}
}
