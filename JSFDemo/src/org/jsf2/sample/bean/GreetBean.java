/**
 * 
 */
package org.jsf2.sample.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Sandaruwan
 *
 */
@ManagedBean ( name="greet")
@RequestScoped
public class GreetBean {

	public GreetBean(){}
	
	public String greet(){
		
		return "Greeting from JSF 2 !!!";
	}
}
