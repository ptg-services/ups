package com.intuit.ups;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
	private URL url = null;
	public ParseURL() {
	}
	public ParseURL(String url) throws MalformedURLException {
		this.url = new URL(url);
	}

	public static void main(String[] args) throws Exception {

		String stringUrl = "http://" + "www.google.com";
		ParseURL aURL = create(stringUrl);

		System.out.println("protocol = " + aURL.getProtocol());
		System.out.println("authority = " + aURL.getAuthority());
		System.out.println("host = " + aURL.getHost());
		System.out.println("port = " + aURL.getPort());
		System.out.println("path = " + aURL.getPath());
		// System.out.println("query = " + aURL.getQuery());
		// System.out.println("filename = " + aURL.getFile());
		// System.out.println("ref = " + aURL.getRef());
	}

	public String getPath() {
		String path = url.getPath();
		if (path == null)
			return path;
		path = path.trim();
		if (path.startsWith("/")) {
			path = path.substring(1);
		}
		return path;
	}

	public int getPort() {
		int port = url.getPort();
		port = port == -1 ? 80 : port;
		return port;
	}

	public String getHost() {
		return url.getHost();
	}

	public String getAuthority() {
		return url.getAuthority();
	}

	public String getProtocol() {
		return url.getProtocol();
	}


	public static ParseURL create(String stringUrl) throws MalformedURLException {
		return new ParseURL(stringUrl);
	}
}
