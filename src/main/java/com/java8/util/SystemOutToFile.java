package com.java8.util;

import java.io.*;

public class SystemOutToFile {

	public static void main(String agrs[]) {

		try {
			FileOutputStream fout = new FileOutputStream("stdout.log");
			FileOutputStream ferr = new FileOutputStream("stderr.log");

			MultiOutputStream multiOut = new MultiOutputStream(System.out, fout);
			MultiOutputStream multiErr = new MultiOutputStream(System.err, ferr);

			PrintStream stdout = new PrintStream(multiOut);
			PrintStream stderr = new PrintStream(multiErr);

			System.setOut(stdout);
			System.setErr(stderr);
		} catch (FileNotFoundException ex)

		{
			// Could not create/open the file
		}

		System.out.println("Holy Rusty Metal Batman! I can't believe this was so simple!"+"/n");
		System.err.println("God I hate you Robin.");
		System.err.format("God I hate you Robin -> %s", "mike");
	}

	public static class MultiOutputStream extends OutputStream {
		OutputStream[] outputStreams;

		public MultiOutputStream(OutputStream... outputStreams) {
			this.outputStreams = outputStreams;
		}

		@Override
		public void write(int b) throws IOException {
			for (OutputStream out : outputStreams)
				out.write(b);
		}

		@Override
		public void write(byte[] b) throws IOException {
			for (OutputStream out : outputStreams)
				out.write(b);
		}

		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			for (OutputStream out : outputStreams)
				out.write(b, off, len);
		}

		@Override
		public void flush() throws IOException {
			for (OutputStream out : outputStreams)
				out.flush();
		}

		@Override
		public void close() throws IOException {
			for (OutputStream out : outputStreams)
				out.close();
		}
	}

}
