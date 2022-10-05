package stepDefination_Sept;

import io.restassured.path.json.JsonPath;
import resources.Payload;

public class TestComplexJson {

	public static void main(String[] args) {
		
		// Section 6 -- video 26 27 28 29
		// Print no of courses return by API
		JsonPath js = new JsonPath(Payload.complexJson());
		int coursecount = js.getInt("courses.size()");
		System.out.println(coursecount);
		
		// Print account no 
		
		String accountno = js.get("accountno");
		System.out.println(accountno);
		
		// Print title of the first course
		
		for(int i=0;i<coursecount;i++) {
			String title = js.get("courses["+i+"].title").toString();
			System.out.println(title);
						
		}
		// Print title and price
		
				for(int i=0;i<coursecount;i++) {
					String title = js.get("courses["+i+"].title").toString();
					int price = js.get("courses["+i+"].price");
					System.out.println(title + "-----" +  price);
								
				}
	
	}

}
