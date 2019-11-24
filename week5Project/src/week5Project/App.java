package week5Project;

public class App {

	public static void main(String[] args) {
		

		Logger logger1 = new AsteriskLogger();
		
		logger1.log("Congratulations");
		
		logger1.error("Fantastic");

		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("GREETINGS FRIEND");
		
		logger2.error("GOODBYE");
		
		
		
		
	}

}