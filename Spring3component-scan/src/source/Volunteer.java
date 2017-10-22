package source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Volunteer implements Common{
	
	@Value("GOOD !!")
	private String thoughts;
	@Value("100")
	private int rate;
	
	
	private Magician magician;

	
	public Magician getMagician() {
		return magician;
	}

	@Autowired

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