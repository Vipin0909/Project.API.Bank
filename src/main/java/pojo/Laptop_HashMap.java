package pojo;

public class Laptop_HashMap {

	private String laptopcountry;
	private String language;
	
	public Laptop_HashMap(String laptopcountry, String language) {
		this.laptopcountry = laptopcountry;
		this.language = language;
	}
	public String getLaptopcountry() {
		return laptopcountry;
	}
	public void setLaptopcountry(String laptopcountry) {
		this.laptopcountry = laptopcountry;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Laptop_HashMap [laptopcountry=" + laptopcountry + ", language=" + language + "]";
	}

}
