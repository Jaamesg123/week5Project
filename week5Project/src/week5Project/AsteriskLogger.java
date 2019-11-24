package week5Project;

public class AsteriskLogger implements Logger {

	
	
	@Override
	public void log(String log) {
		 System.out.println("*** " + log.toString() + " ***");
		
		
	}
	
	@Override
	public void error(String error) {
		 	System.out.println("************************" + 
		 						"\n" + "*** Error: " + error.toString() + " ***" +
		 						"\n" + "************************");
		}
		
	}

