package coreservlets;

import java.io.Serializable;

import javax.inject.Named;
import javax.faces.flow.FlowScoped;

@Named
@FlowScoped("flow2")
public class Flow2Bean implements Serializable {
  private static final long serialVersionUID = 1L;
  private String firstName, lastName;
  private int pagesViewed = 1;
  
  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public int getPagesViewed() {
    return(pagesViewed++);
  }
  
  /** Randomly chooses a page inside the flow. 
   *  This assumes the flow has confirmation1.xhtml 
   *  and confirmation2.xhtml inside of it. 
   */
  
  public String doFlow() {
    if (Math.random() > 0.5) {
      return("confirmation1");
    } else {
      return("confirmation2");
    }
  }
}
