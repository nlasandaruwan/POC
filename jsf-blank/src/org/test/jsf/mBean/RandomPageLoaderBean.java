package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;

import org.test.jsf.util.RandomUtils;

@ManagedBean
public class RandomPageLoaderBean {
	private String[] resultPages = { "/WEB-INF/view/random/Page1", "/WEB-INF/view/random/Page2", "/WEB-INF/view/random/Page3" };

	private String message = "put sample message";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String choosePage() {
		return (RandomUtils.randomElement(resultPages));
	}

}
