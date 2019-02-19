package Factory_Pattern_Lab;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String logType;
		if (args.length > 0) {
			logType = args[0];
		} else {
			logType = Consts.LOGTYPE_CONSOLE;
		}

		TraceFactory traceFactory = new ConcreteTraceFactory();

		Trace trace = traceFactory.getTrace(logType);

		trace.debug("Hello debug");
		trace.error("Hello error");
	}

}
