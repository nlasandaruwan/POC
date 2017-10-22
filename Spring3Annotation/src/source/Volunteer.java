package source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import annotation.StringedMagic;

public class Volunteer {
	
	private String thoughts;
	private int rate;
	
	
	private Magician magician;

	
	public Magician getMagician() {
		return magician;
	}

	@Autowired
	@Qualifier("magic2")
	@StringedMagic
	public void setMagician(Magician magician) {
		this.magician = magician;
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