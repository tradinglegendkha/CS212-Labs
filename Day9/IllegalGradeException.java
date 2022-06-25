package Day9;
// creating a custom exception by creating a child class of an existing exception
public class IllegalGradeException extends IllegalArgumentException {
	
	
	// use the parent default constructor
	public IllegalGradeException() {
		super();
	}
	
	// use the parent 
	public IllegalGradeException(String err) {
		super(err);
	}

}
