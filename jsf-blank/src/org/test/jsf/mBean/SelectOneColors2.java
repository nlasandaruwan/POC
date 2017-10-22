package org.test.jsf.mBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneColors2 extends SelectOneColors1 {
	public SelectOneColors2() {

		color1 = "blue";
		color2 = "blue";
		color3 = "blue";
		color4 = "blue";
	}

	public String showColors() {
		return ("/WEB-INF/view/choices/select-one-color-result2");
	}
}