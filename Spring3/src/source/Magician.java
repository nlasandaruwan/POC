package source;

import java.util.List;

public class Magician {

	public static String BATTEN = "magic batten";
	
	private String doMagic;
	private String magiEmail;
	private String fromProp;
	private String nullSafeAccess;
	private double pi;
	private City cityOfMagician;
	private String valueFromProperty;
	private List<City> bigCities;
	
	
	/*private boolean magicianPaid;

	

	public boolean isMagicianPaid() {
		return magicianPaid;
	}

	public void setMagicianPaid(boolean magicianPaid) {
		this.magicianPaid = magicianPaid;
	}*/

	
	public String getFromProp() {
		return fromProp;
	}

	public List<City> getBigCities() {
		return bigCities;
	}

	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}

	public String getValueFromProperty() {
		return valueFromProperty;
	}

	public void setValueFromProperty(String valueFromProperty) {
		this.valueFromProperty = valueFromProperty;
	}

	public City getCityOfMagician() {
		return cityOfMagician;
	}

	public void setCityOfMagician(City cityOfMagician) {
		this.cityOfMagician = cityOfMagician;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getNullSafeAccess() {
		return nullSafeAccess;
	}

	public void setNullSafeAccess(String nullSafeAccess) {
		this.nullSafeAccess = nullSafeAccess;
	}

	public void setFromProp(String fromProp) {
		this.fromProp = fromProp;
	}

	public String getMagiEmail() {
		return magiEmail;
	}

	public void setMagiEmail(String magiEmail) {
		this.magiEmail = magiEmail;
	}

	
	public String getDoMagic() {
		return doMagic;
	}

	public void setDoMagic(String doMagic) {
		this.doMagic = doMagic;
	}

	public String sayMagic() {
		return "Hello world its all abt Magic :" + doMagic;
	}
}
