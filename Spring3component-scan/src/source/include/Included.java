package source.include;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import source.Common;

@Component("include")
public class Included implements Common{

	@Value("Included !!!")
	private String include;

	public String getInclude() {
		return include;
	}

	public void setInclude(String include) {
		this.include = include;
	}
}
