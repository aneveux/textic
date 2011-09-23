package org.textic.core.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringCreator {

	private StringWriter stringWriter;

	private PrintWriter printWriter;

	public StringCreator() {
		this.stringWriter = new StringWriter();
		this.printWriter = new PrintWriter(stringWriter, true);
	}

	public StringCreator println(String msg) {
		this.printWriter.println(msg);
		return this;
	}

	public StringCreator print(String msg) {
		this.printWriter.print(msg);
		return this;
	}

	@Override
	public String toString() {
		this.printWriter.flush();
		this.stringWriter.flush();
		return this.stringWriter.toString();
	}

}
