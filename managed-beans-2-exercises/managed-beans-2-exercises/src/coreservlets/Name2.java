package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Name2 extends Name1 {
  @Override
  public String showName() {
    return("show-name-2");
  }
}
