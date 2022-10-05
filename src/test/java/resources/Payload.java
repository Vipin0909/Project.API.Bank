package resources;

public class Payload {

	
	public static String addCustomerdata() {
		
		return "{\"accountno\":\"9922534265\",\"branch\":\"Kothrud\",\"city\":\"Pune\",\"country\":\"India\",\"firstname\":\"tom\",\"lastname\""
				+ ":\"hank\",\"mobile\":\"9922534265\"}";
	}
	
	public static String complexJson(){
		
		return "{\r\n"
				+ "    \"accountno\": \"22\",\r\n"
				+ "    \"firstname\": \"Bill\",\r\n"
				+ "    \"lastname\": \"Gates\",\r\n"
				+ "    \"mobile\": \"22\",\r\n"
				+ " \r\n"
				+ " \"courses\": [\r\n"
				+ "  {\r\n"
				+ "   \"title\": \"Selenium Python\",\r\n"
				+ "   \"price\": 50,\r\n"
				+ "   \"copies\": 6\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "   \"title\": \"Cypress\",\r\n"
				+ "   \"price\": 40,\r\n"
				+ "   \"copies\": 4\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "   \"title\": \"RPA\",\r\n"
				+ "   \"price\": 45,\r\n"
				+ "   \"copies\": 10\r\n"
				+ "  }\r\n"
				+ " ]\r\n"
				+ "}";
	}
	
}
