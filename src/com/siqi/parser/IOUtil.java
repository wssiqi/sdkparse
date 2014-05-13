package com.siqi.parser;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Process with IO, thread safe.
 * 
 * @author Administrator
 * 
 */
public class IOUtil {
	private static final byte[] EMPTY_BYTES = new byte[0];

	public static byte[] readAndClose(InputStream in) throws IOException {
		byte[] b;
		try {
			b = read(in);
		} catch (IOException e) {
			throw e;
		} finally {
			close(in);
		}
		return b;
	}

	public static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static byte[] read(InputStream in) throws IOException {
		byte[] b = EMPTY_BYTES;
		if (in != null) {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			int len = -1;
			byte[] buf = new byte[64 * 1024];
			while ((len = in.read(buf)) != -1) {
				baos.write(buf, 0, len);
			}

			b = baos.toByteArray();
		}
		return b;
	}
}
