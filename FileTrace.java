package Factory_Pattern_Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTrace implements Trace {

	private boolean isDebug;
	private String fileName = "trace.log";
	private PrintWriter out;

	public FileTrace() throws IOException {
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		out = new PrintWriter(bw);
		isDebug = true;
	}

	@Override
	public void setDebug(boolean debug) {
		this.isDebug = debug;
	}

	@Override
	public void debug(String message) {
		if (isDebug) {
			out.println("[DEBUG] " + message);
			out.flush();
		}
	}

	@Override
	public void error(String message) {
		if (isDebug) {
			out.println("[ERROR] " + message);
			out.flush();
		}
	}

}
