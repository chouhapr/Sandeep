package FirstExercise;

public class ExerciseStringArraySum {

	public static void main(String[] args) {

		String[] s = {"10", "20", "30", "40"};
		
		int total = 0;
		
		for(String temp : s) {
			total = total + Integer.parseInt(temp);
		}
		System.out.println(total);
	}

}
