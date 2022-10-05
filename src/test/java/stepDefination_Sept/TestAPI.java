// section 4 - video 17
package stepDefination_Sept;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.Payload;
import resources.Utilities;

import static io.restassured.RestAssured.*;



public class TestAPI extends Utilities {
// create API and send it to Database
	static String Postrequest;
	static String Getresponse;
	//static RequestSpecification request;
	
	public static void main(String[] args) {
		
		RestAssured.baseURI  = "http://localhost:3000";
		
		
		  // add - POST API to add customer data section 5 -- video 20 
		Postrequest = given().log().all().contentType("application/json").body(Payload.
		  addCustomerdata()). when().post("/credit/post/customerdata").
		  then().assertThat().statusCode(200).extract().response().asString();
		 
		 
		/*
		 * // how to use Request Spec Builder in above postrequest - section 13 video 75
		 * request = given().spec(reqspec).body(Payload.addCustomerdata()); Response
		 * response = resspec.when().post("/credit/post/customerdata").
		 * then().spec(resspec).extract().response();
		 */
		 
		 System.out.println("Post API to post the customer data in mongoDB -- > " + Postrequest);
		 // parse the JSON response to get the values like here to get the mobile no from the json. to parse the value there is one class
		 // JsonPath -- 
		 
		 JsonPath js = new JsonPath(Postrequest);
		 String acctualaccount = js.getString("accountno");
		 String mobileextract = js.getString("mobile");
		 System.out.println(mobileextract);
		 System.out.println(acctualaccount);
		 
		 // get API
		 Getresponse = given().log().all().pathParam("mobile", mobileextract).
		 when().get("/credit/get/bymobile/{mobile}").then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jsresponse = new JsonPath(Getresponse);
		System.out.println("Get API to get the customer data using mobile no -- > " + Getresponse);
		String expectedaccount = jsresponse.getString("accountno");
		
		
		// Assertions using TestNG - section 5 -- video 23
		
		//Assert.assertEquals(acctualaccount, expectedaccount);
	
		
	}

}
