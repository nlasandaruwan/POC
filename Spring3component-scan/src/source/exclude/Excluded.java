package source.exclude;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import source.Common;

@Component
public class Excluded implements Common{

	@Value("Excluded !!!")
	private String exclude;

	public String getExclude() {
		return exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
	}

}
