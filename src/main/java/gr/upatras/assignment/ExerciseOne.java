package gr.upatras.assignment;

public class ExerciseOne {

	public static void main(String[] args) {
		System.out.println(subtract(5, 3));
	}
	
	public static String subtract(int a, int b) {
		if (a - b > 0) {
			return "POSITIVE";
		}
		else if (a - b < 0) {
			return "NEGATIVE";
		}
		else {
			return "EQUAL";
		}
	}

}