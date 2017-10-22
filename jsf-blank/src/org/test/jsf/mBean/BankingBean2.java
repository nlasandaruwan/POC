package org.test.jsf.mBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BankingBean2 extends BankingBean implements Serializable {

	public String showBalance() {

		String result = super.showBalance();
		return (result + "-with-session?faces-redirect=true");

	}
}