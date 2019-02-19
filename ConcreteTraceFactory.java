package Factory_Pattern_Lab;

import java.io.IOException;

public class ConcreteTraceFactory implements TraceFactory {

	@Override
	public Trace getTrace(String logType) throws IOException {
		if (logType.equals(Consts.LOGTYPE_CONSOLE)) {
			return new ConsoleTrace();
		} else if (logType.equals(Consts.LOGTYPE_FILE)) {
			return new FileTrace();
		}
		return null;
	}

}
