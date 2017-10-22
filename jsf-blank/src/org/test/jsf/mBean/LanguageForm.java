package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LanguageForm {

	private String language;

	public String getLanguage() {
		return (language);
	}

	public void setLanguage(String language) {
		this.language = language.trim();
	}

	public String showChoice() {
		
		if (isMissing(language)) {
			return ("/WEB-INF/view/language/missing-language");
		} else if (language.equalsIgnoreCase("Java")
				|| language.equalsIgnoreCase("Groovy")) {
			return ("/WEB-INF/view/language/good-language");
		} else {
			return ("/WEB-INF/view/language/bad-language");
		}
	}

	private boolean isMissing(String value) {
		return ((value == null) || (value.trim().isEmpty()));
	}
}
