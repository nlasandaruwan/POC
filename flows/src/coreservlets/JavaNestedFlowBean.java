package coreservlets;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("thirdJavaFlow")
public class JavaNestedFlowBean implements Serializable {
  private static final long serialVersionUID = 1L;
  private String param3, param4;
  
  public String getParam3() {
    return(param3);
  }
  
  public void setParam3(String param3) {
    this.param3 = param3;
  }
  
  public String getParam4() {
    return(param4);
  }
  
  public void setParam4(String param4) {
    this.param4 = param4;
  }
  
  public String doFlow() {
    if (param3.equalsIgnoreCase(param4)) {
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
