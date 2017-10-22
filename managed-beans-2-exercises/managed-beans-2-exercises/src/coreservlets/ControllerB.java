package coreservlets;

import javax.faces.bean.*;

@ManagedBean(name="b")
@ApplicationScoped
public class ControllerB {
  public String doNavigation() {
    if (Math.random() > 0.5) {
      return("c");
    } else {
      return("defeat");
    }
  }
}
