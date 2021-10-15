
package EmpWage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilderUC14 {
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
		System.out.println("day:" + totalWorkingDays +" " + "Emp hr: " +empHrs);
	}
	
	int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	System.out.println("Total Employee Wage: " + totalEmpWage);
	return totalEmpWage;

	}

        public static void main(String args[]) {
        	
        	System.out.println( "Welcome to Employee Wage Computation Program");
        	
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	Company1 C1 =new Company1();
        	System.out.print("TCS Company:");
        	getTotalEmpWage(20,20,100);
        	list.add(getTotalEmpWage(C1));
   
        	Company2 C2 =new Company2();
        	System.out.print("Dell Company:");
        	getTotalEmpWage(20,26,90);
        	list.add(getTotalEmpWage(C2));
        	int inp=0;
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Please enter correct options to search by Company name:");
        	System.out.println("option 1 for TCS Company" );
        	System.out.println("option 2 for Dell company" );
        	inp=scan.nextInt();
        	if (inp==1) {
        		System.out.println("You have searched for TCS Employee");
        		getTotalEmpWage(20,20,100);
        		
        	}
        	else if(inp ==2) {
        		System.out.println("You have searched for Dell Employee");
        		getTotalEmpWage(20,26,90);
        		
        	}
        	else {
        		System.out.println("Invalid Entry,Please select the correct options");
        		inp=scan.nextInt();
        	}
        	
        }

		private static Integer getTotalEmpWage(Company2 c2) {
			// TODO Auto-generated method stub
			return null;
		}

		private static Integer getTotalEmpWage(Company1 c1) {
			// TODO Auto-generated method stub
			return null;
		}
}
