package source;

public class Volunteer {
	private String batten;
	private String thoughts;
	private int rate;
	private String volanteeEmail;
	private String nullSafeAssign;
	/*private boolean volunteerPaid;
	
	
	
	public boolean isVolunteerPaid() {
		return volunteerPaid;
	}
	public void setVolunteerPaid(boolean volunteerPaid) {
		this.volunteerPaid = volunteerPaid;
	}*/
	public String getVolanteeEmail() {
		return volanteeEmail;
	}
	public String getNullSafeAssign() {
		return nullSafeAssign;
	}
	public void setNullSafeAssign(String nullSafeAssign) {
		this.nullSafeAssign = nullSafeAssign;
	}
	public void setVolanteeEmail(String volanteeEmail) {
		this.volanteeEmail = volanteeEmail;
	}
	public String getBatten() {
		return batten;
	}
	public void setBatten(String batten) {
		this.batten = batten;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
}