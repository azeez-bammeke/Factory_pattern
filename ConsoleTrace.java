package Factory_Pattern_Lab;

public class ConsoleTrace implements Trace {
	boolean isDebug = true;

	@Override
	public void setDebug(boolean debug) {
		this.isDebug = debug;
	}

	@Override
	public void debug(String message) {
		if (isDebug) {
			System.out.println("[DEBUG] " + message);
		}
	}

	@Override
	public void error(String message) {
		if (isDebug) {
			System.out.println("[ERROR] " + message);
		}
	}
}
