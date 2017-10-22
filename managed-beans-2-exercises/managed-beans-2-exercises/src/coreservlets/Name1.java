package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Name1 {
  private String name = "Cay";

  public String getName() {
    return(name);
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String showName() {
    return("show-name-1");
  }
}
