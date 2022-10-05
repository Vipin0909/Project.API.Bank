package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

// Request Spec builder and Response Spec Builder
public class Utilities {

	public static RequestSpecification reqspec;
	public static ResponseSpecification resspec;
	public static String keyBaseUri;
	
	public static RequestSpecification requestspecification() throws FileNotFoundException {
		if(reqspec==null) {
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			reqspec = new RequestSpecBuilder().setBaseUri(Utilities.getProperty("baseuri")).setContentType("application/json")
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
			 return reqspec;
		}
		return reqspec;
		
		
	}
	public static ResponseSpecification responsespecification() {
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).build();
		return resspec;
		
	}
	
	// this function will get value of any key defined in properties file and return that string value
	public static String getProperty(String key) {
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Eclipse-Workplace\\UB2022\\API.Project.2022.Sept\\src\\test\\java\\resources\\global.properties");
			prop.load(fis);
			keyBaseUri= prop.getProperty(key);
		}catch(Exception e){
			
		}
		return keyBaseUri;
		
		
	}
	
	
}
