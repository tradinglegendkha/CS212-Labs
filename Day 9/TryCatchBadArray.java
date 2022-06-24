import java.util.logging.Level;
import java.util.logging.Logger;


public class TryCatchBadArray {
	// create logger for this class
	private static final Logger logger = Logger.getLogger(TryCatchBadArray.class.getName());
	public static void main(String [] args)
	{
		
		// log info on program
		logger.info("Logger Name: " + logger.getName());
		// warning before run
		logger.warning("May cause index out of bounds");
		
		int arr [] = {1,2,3};
		
		for (int i = 0; i <= 5; i++)
		{
			try 
			{
				System.out.println(arr[i]);
			}
			// example of using logger to log exception to console
			catch (ArrayIndexOutOfBoundsException ae)
			{
				logger.log(Level.SEVERE, "Array out of bounds exception occured", ae);			
			}
			catch(Exception e)
			{
				logger.log(Level.SEVERE, "Array out of bounds exception occured", e);	
			}
			
		

		}
		
		System.out.println("Goodbye...");
	}

}
