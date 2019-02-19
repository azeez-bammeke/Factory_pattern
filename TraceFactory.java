package Factory_Pattern_Lab;

import java.io.IOException;

public interface TraceFactory {

	Trace getTrace(String logType) throws IOException;

}
