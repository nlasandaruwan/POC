package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager=true)
@SessionScoped
public class SessionScopeMessage {

	private String message = "This is a Message from SessionScopeMessage which is SessionScope : " + Math.random();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
