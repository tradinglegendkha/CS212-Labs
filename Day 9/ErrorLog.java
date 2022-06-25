import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ErrorLog {
	public Logger logger;
	private FileHandler fh;
	public ErrorLog(String className)
	{
		logger = Logger.getLogger(className);
		// creates a format to store current time
		SimpleDateFormat format = new SimpleDateFormat("M-d-Y_hh-mm-ss-aa");
		// allows us to log our errors in a file
		try 
		{
			fh = new FileHandler("logs/" + logger.getName() + "_" + format.format(Calendar.getInstance().getTime()) +".log");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);
		// won't print to console only to .log created
		logger.setUseParentHandlers(false);
		
		logger.info("Logger Name: " + logger.getName());
	}

}
