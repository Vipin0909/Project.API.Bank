package resources;
// Bank application TestDataBuild

import pojo.HDFCAccountOpenUserData;
import pojo.ICICIAccountOpenUserData;

public class TestDataBuild {
	
	// created a new method NewAccountOpen as per pojo class. created object of pojo class and set the data
	public HDFCAccountOpenUserData NewAccountOpen(String mobile,String country,String firstname,String lastname,String accountno,String branch,String city) {
		
		HDFCAccountOpenUserData hdfcuser = new HDFCAccountOpenUserData();
		hdfcuser.setMobile(mobile);
		hdfcuser.setCountry(country);
		hdfcuser.setFirstname(firstname);
		hdfcuser.setLastname(lastname);
		hdfcuser.setAccountno(accountno);
		hdfcuser.setBranch(branch);
		hdfcuser.setCity(city);
		
		return hdfcuser;

	}

	public ICICIAccountOpenUserData ICICINewAccountOpen(String bankname, String mobile, String country, String firstname,
			String lastname, String accountno, String branch, String city) {
		
		ICICIAccountOpenUserData iciciuser = new ICICIAccountOpenUserData();
		
			iciciuser.setBankname(bankname);
			iciciuser.setMobile(mobile);
			iciciuser.setCountry(country);
			iciciuser.setFirstname(firstname);
			iciciuser.setLastname(lastname);
			iciciuser.setAccountno(accountno);
			iciciuser.setBranch(branch);
			iciciuser.setCity(city);
			return iciciuser;
		
	}
	
}
