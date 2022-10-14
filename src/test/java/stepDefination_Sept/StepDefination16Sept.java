package stepDefination_Sept;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.HDFCAccountOpenUserData;
import pojo.ICICIAccountOpenUserData;
import resources.TestDataBuild;
import resources.Utilities;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.junit.Assert;

public class StepDefination16Sept extends Utilities
{
	static String jsonoutcome;
	static JsonPath js;
	static String jsonoutcome_ICICI;
	static JsonSerializer jsbank;
	static HDFCAccountOpenUserData newaccountdetails;
	static ICICIAccountOpenUserData icicinewaccount;
	
	TestDataBuild userdata = new TestDataBuild();
	
	@Given("BankData {string} {string} {string} {string} {string} {string} {string}")
	public void bank_data(String mobile, String country,String firstname,String lastname,String accountno,String branch,String city) throws IOException, SerializeException, ParseException {
		
		newaccountdetails = userdata.NewAccountOpen(mobile, country, firstname, lastname, accountno, branch, city);
		
		// see how request specification and response specification used here
		given().log().all().spec(requestspecification()).body(newaccountdetails).when().post("/credit/post/HDFCcustomerdata").then().spec(responsespecification());
		
		// Serialization  Pojo to Json
		 JsonSerializer jsbank = JsonSerializer.DEFAULT;
		 jsonoutcome = jsbank.serialize(newaccountdetails);
		 System.out.println("POJO to JSON HDFC Bank ... " +jsonoutcome);
		
		//newaccountdetails.getAccountno();
		//System.out.println(newaccountdetails.getAccountno());
		
		// Deseralization JSON to POJO
		JsonParser jp = JsonParser.DEFAULT;
		HDFCAccountOpenUserData parseouput = jp.parse(jsonoutcome, HDFCAccountOpenUserData.class);
		System.out.println("JSON to POJO ... " + parseouput);
		
		Assert.assertEquals(newaccountdetails.getAccountno(), parseouput.getAccountno());
	}
	
	@Given("BankData {string} {string} {string} {string} {string} {string} {string} {string}")
	public void bank_data(String bankname,String mobile, String country,String firstname,String lastname,String accountno,String branch,String city) throws FileNotFoundException, Exception {
		
		icicinewaccount= userdata.ICICINewAccountOpen(bankname, mobile, country, firstname, lastname, accountno, branch, city);
		given().log().all().spec(requestspecification()).body(icicinewaccount).when().post("/credit/post/ICICIcustomerdata").then().spec(responsespecification());
		
		System.out.println("new api and field addded as Bank name "+ icicinewaccount.getBankname());
		
		// Serialization  Pojo to Json
				 JsonSerializer jsbank = JsonSerializer.DEFAULT;
				 jsonoutcome_ICICI = jsbank.serialize(icicinewaccount);
				 System.out.println("POJO to JSON ICICI bank ... " +jsonoutcome_ICICI);
	}
	
	// THIS is IMP method in this framework, INTERVIEW function	
	@Given("{string} in response body is {string}")
	public static void in_response_body_is(String key, String expectedvalue) {
		// key mobile & value is 9922534265
		
				js = new JsonPath(jsonoutcome);
			    System.out.print("actual value --> " + js.get(key));
			    System.out.print(" ");
			    System.out.println("expected value --> " + expectedvalue);
			    Assert.assertEquals(js.get(key), expectedvalue);
	}

}
