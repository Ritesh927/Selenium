package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		// get the java representative object of the physical file.
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		// create an object of properties class.
		Properties p = new Properties();
		// load the file.
		p.load(fis);
		// get the data(value) by passing the key.
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}
}
