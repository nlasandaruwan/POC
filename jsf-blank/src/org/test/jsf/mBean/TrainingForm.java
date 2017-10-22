package org.test.jsf.mBean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.test.jsf.util.LanguageUtils;

@ManagedBean
public class TrainingForm {
	
	private String emailAddress;
	private String favoriteLanguage = LanguageUtils.findMostPopularLanguage(0);
	private String secondFavoriteLanguage = LanguageUtils.findMostPopularLanguage(1);
	private boolean isExpert = true;
	private boolean isLiar = false;
	private List<String> languagesToStudy;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getSecondFavoriteLanguage() {
		return secondFavoriteLanguage;
	}

	public void setSecondFavoriteLanguage(String secondFavoriteLanguage) {
		this.secondFavoriteLanguage = secondFavoriteLanguage;
	}

	public boolean isExpert() {
		return isExpert;
	}

	public void setExpert(boolean isExpert) {
		this.isExpert = isExpert;
	}

	public boolean isLiar() {
		return isLiar;
	}

	public void setLiar(boolean isLiar) {
		this.isLiar = isLiar;
	}

	public String[] getAvailableLanguages() {
		return (LanguageUtils.languageArray());
	}

	public String showTrainingPlan() {
		int numLanguagesToStudy;
		if (isExpert) {
			numLanguagesToStudy = 4;
		} else {
			numLanguagesToStudy = 2;
		}
		if (isLiar) {
			return ("/WEB-INF/view/study/liar");
		} else {
			languagesToStudy = LanguageUtils.randomLanguages(numLanguagesToStudy);
			return ("/WEB-INF/view/study/study-plan");
		}
	}

	public List<String> getLanguagesToStudy() {
		return (languagesToStudy);
	}
}