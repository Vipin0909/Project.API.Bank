package stepDefination_Sept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class TestHashMap {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000";
		
		List<HashMap<String,Object>> list = new ArrayList<>();
				
		HashMap<String, Object> storelocation = new HashMap<>();
		
		storelocation.put("city", "mumbai");
		storelocation.put("dealer", "mark");
		storelocation.put("city", "delhi");
		storelocation.put("city", "nagpur");
		
		
		HashMap map1 = new HashMap();
		
		map1.put("laptopname", "HP");
		map1.put("price", "20000");
		list.add(map1);
		
		HashMap map2 = new HashMap();
		map2.put("laptopname", "DELL");
		map2.put("price", "50000");
		list.add(map2);
		
		HashMap map3 = new HashMap();
		map3.put("laptopname", "LENOVO");
		map3.put("price", "60000");
		list.add(map3);
		
		HashMap map = new HashMap();
		map.put("laptop", list);
		map.put("locations", storelocation);
		
		given().log().all().contentType("application/json").body(map).when().post("/posts/seri/laptop").then().statusCode(200);
		
				
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(0));
			break;
		}
		
		

	}

}
