package org.test.jsf.mBean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class ApplicationScopeMessage {

	private String message = "This is a General Message from ApplicationScopeMessage which is ApplicationScope  !!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
