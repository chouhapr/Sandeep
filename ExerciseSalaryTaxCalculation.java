package FirstExercise;

public class ExerciseSalaryTaxCalculation {

	public static void main(String[] args) {

		//Salary = 0 to 15000 Tax is 15%
		//	Salary = 15000 to 50000 Tax is 25%
		//Salary = Above 50000 Tax is 35%
		
		double salary = 100000;
		double tax = 0;
		
		if(salary <= 15000) {
			tax = salary * .15;
			System.out.println(tax);
		}else if(salary <= 50000) {
			//System.out.println("in");
			tax = salary * .25;
			//System.out.println("ine");
			System.out.println(tax);
		}else {
			tax = salary * .35;
		System.out.println(tax);
			
		}
	}

}
