
public class Grade {
	
	double grade;
	
	public Grade()
	{
		grade = 0;
	}
	
	public Grade(double grade)
	{
		// defining when the exception is thrown, you have to catch it elsewhere
		if (grade < 0 || grade > 100)
			throw new IllegalGradeException(grade + " not between 0 and 100");
		else
			this.grade = grade;
	}

}
