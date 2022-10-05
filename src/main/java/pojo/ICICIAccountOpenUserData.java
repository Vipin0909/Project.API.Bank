package pojo;

public class ICICIAccountOpenUserData {

	private String mobile;
	private String country;
	private String firstname;
	private String lastname;
	private String accountno;
	private String branch;
	private String city;
	private String bankname; // new filed added
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public String toString() {
		return "ICICIAccountOpenUserData [mobile=" + mobile + ", country=" + country + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", accountno=" + accountno + ", branch=" + branch + ", city=" + city
				+ ", bankname=" + bankname + "]";
	}

	
	
	
	
}
