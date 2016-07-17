/**
* CourseGrade determine the final grade which is computed as
* the weighted sum of the grades obtained in exam, lab and homework
*/

public class CourseGrade
{

	public static void main(String[] args)
	{
		final int examWeight=70; // Percentage weight given to examination
		final int labWeight =20; // Percentage weight given to lab work
		final int hwWeight =10; // Percentage weight given to homework assignment
		double examScore;	// Examination score obtained by  student
		double labScore;	// Lab score obtained by student
		double hwScore;		// Homework score obtained by student
		double finalGrade;	// Final grade obtained by student

		// Ask studen to input score for exam. Lab and homework

	
		IO.output("Enter your exam grade: ");
		examScore = IO.inputDouble();
		IO.output("Enter your lab grade: ");
		labScore = IO.inputDouble();
		IO.output("Enter your homework grade: ");
		hwScore = IO.inputDouble();

		// Computer final grade as the weighted sum of exam, lab and homework scores

		examScore = examScore * (examWeight / 100.0);		
		labScore = labScore * (labWeight / 100.0);
		hwScore = hwScore * (hwWeight /100.0);	
		finalGrade = examScore + labScore + hwScore;

		// Output the final grade

		IO.output("Your final grade is: " + finalGrade);

	}

}





