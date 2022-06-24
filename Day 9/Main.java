import java.util.logging.Level;

public class Main 
{

	public static void main (String [] args)
	{
		ErrorLog errlog = new ErrorLog(Main.class.getName());
		
		try
		{
			Grade g = new Grade(-5);
		}
		// we can catch the exception we made here
		catch (IllegalGradeException ge)
		{
			errlog.logger.log(Level.SEVERE, "Illegal Grade Exception occured", ge);	
		}

	}

}
