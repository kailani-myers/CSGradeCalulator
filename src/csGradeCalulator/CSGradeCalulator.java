package csGradeCalulator;
import java.util.Scanner; 

public class CSGradeCalulator {
	// static double[] gradeArray;
	public static void main(String[] args) {
		//explanation message
		System.out.println("This program will calculate your grade");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		Scanner userInput = new Scanner(System.in);
		System.out.println("How many grades do you want to calculate? ");
		
		//this asks the user for each grade and adds it to an array
		int gradeAmount = userInput.nextInt();
		double[] gradeArray = new double[gradeAmount];
			for(int i = 0; i < gradeAmount; i++) {
				System.out.println("Please enter the GPA for a course: ");
				double grade = userInput.nextDouble();
				gradeArray[i] = grade;
				System.out.println(gradeArray[i]);
			}			
			
		//this prints out the average grade
		double average = divide(add(gradeAmount, gradeArray), gradeAmount);
		System.out.println("Your average grade is: " + average);
		userInput.close();
	
	}
	
	//this loops through the array and adds the values together
	public static double add(int gradeAmount, double[] gradeArray) {
		double sum = 0;
		int thingy = 0;
		while(thingy < gradeAmount) {
			sum = sum + gradeArray[thingy];
			thingy++;
		}
		return sum;
	}
	
	//this method finds the average of the grades
	public static double divide(double sum, int gradeAmount) {
		double average = (sum/gradeAmount);
		return average;
	}
}

