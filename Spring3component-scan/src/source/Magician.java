package source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import annotation.StringedMagic;

@Component("max")
@StringedMagic
public class Magician implements Common{

	public static String BATTEN = "magic batten";
	@Value("its a Magic !!!")
	private String doMagic;
	
	@Value("nlasandaruwan@gmail.com !!!")
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
