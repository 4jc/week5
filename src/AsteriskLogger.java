
public class AsteriskLogger implements Logger {	//#3a + 4-5
	
	private StringBuilder log;
	private StringBuilder error;
	
@Override
public void Log(StringBuilder log) {
	System.out.println("***" + log + "***");
}

@Override
public void Error(StringBuilder error) {
	for(int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
		}
	System.out.println();
	System.out.println("***ERROR: " + error + "***");
	
	for(int i = 0; i < error.length() + 13; i++) {
		System.out.print("*");
	}
	System.out.println();
}

public StringBuilder getLog() {
	return log;
}

public void setLog(StringBuilder log) {
	this.log = log;
}

public StringBuilder getError() {
	return error;
}

public void setError(StringBuilder error) {
	this.error = error;
}
	
}
