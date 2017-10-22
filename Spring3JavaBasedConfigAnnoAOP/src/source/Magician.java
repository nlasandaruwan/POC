package source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magician {

	public static String BATTEN = "magic batten";

	private String doMagic;
	private String magiEmail;
	private String fromProp;
	
	@Autowired
	private MagicBatten magicBatten;

	public MagicBatten getMagicBatten() {
		return magicBatten;
	}

	public void setMagicBatten(MagicBatten magicBatten) {
		this.magicBatten = magicBatten;
	}

	public String getFromProp() {
		return fromProp;
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
	
	public String sayMagicAnno() {
		return "Hello world its all abt Magic Anno  --------  :" + doMagic;
	}
}
