package source;

import org.springframework.beans.factory.annotation.Value;

import annotation.StringedMagic;

@StringedMagic
public class Magician {

	public static String BATTEN = "magic batten";

	private String doMagic;
	
	@Value("#{magic1.doMagic}")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
