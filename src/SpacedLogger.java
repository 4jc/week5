
public class SpacedLogger implements Logger {	//#3b + 6-8
	
	private StringBuilder log;
	private StringBuilder error;
	
	@Override
	public void Log(StringBuilder log) {	
		for(int i = 1; i < log.length(); i += 2) {
				log.insert(i, " ");		
		}
		System.out.println(log);;
	}	
		
	@Override
	public void Error(StringBuilder error) {
			for(int i = 1; i < error.length(); i += 2) {
				error.insert(i, " ");	
			}
			System.out.println("ERROR: " + error);
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
