package com.siqi.parser;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXB;

import com.siqi.model.SdkAddon;

public class ParserFactory {

	public static void main(String[] args) throws IOException {
		sample0();
	}

	private static void sample0() {
		SdkAddon unmarshal = JAXB.unmarshal(new File("addon.xml"),
				SdkAddon.class);
		JAXB.marshal(unmarshal, new File("addon2.xml"));
		System.out.println(unmarshal);
	}

	public static void sample1() throws MalformedURLException, IOException,
			FileNotFoundException {
		String webUrl = "http://dl-ssl.google.com/android/repository/addon.xml";

		String urlParent = "";
		int lastIndexOf = webUrl.lastIndexOf('/');
		if (lastIndexOf != -1) {
			urlParent = webUrl.substring(0, lastIndexOf);
		}

		URL url = new URL(webUrl);
		Object content = url.getContent();
		if (content instanceof InputStream) {
			byte[] b = IOUtil.readAndClose((InputStream) content);
		}
	}
}
