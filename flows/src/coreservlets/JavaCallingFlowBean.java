package coreservlets;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("secondJavaFlow")
public class JavaCallingFlowBean implements Serializable {
  private static final long serialVersionUID = 1L;
  private String param1="", param2="";
  
  public String getParam1() {
    return(param1);
  }
  
  public void setParam1(String param1) {
    this.param1 = param1;
  }
  
  public String getParam2() {
    return(param2);
  }
  
  public void setParam2(String param2) {
    this.param2 = param2;
  }
  
  public String doFlow() {
    if (param1.equalsIgnoreCase(param2)) {
      FacesContext context = FacesContext.getCurrentInstance();
      FacesMessage fMessage = 
        new FacesMessage("Params must be distinct");
      fMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
      context.addMessage(null, fMessage);
      return(null);
    } else {
      return("results");
    }
  }
}
