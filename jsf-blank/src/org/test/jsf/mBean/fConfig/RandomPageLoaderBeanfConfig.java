package org.test.jsf.mBean.fConfig;

import org.test.jsf.mBean.RandomPageLoaderBean;
import org.test.jsf.util.RandomUtils;

public class RandomPageLoaderBeanfConfig extends RandomPageLoaderBean {

	private String[] resultPages = { "/WEB-INF/view/fConfig/Page1", "/WEB-INF/view/fConfig/Page2", "/WEB-INF/view/fConfig/Page3" };
	
	@Override
	public String choosePage() {
		return (RandomUtils.randomElement(resultPages));
	}
}
