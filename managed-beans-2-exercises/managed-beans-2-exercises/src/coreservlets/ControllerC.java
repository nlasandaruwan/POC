package coreservlets;

import javax.faces.bean.*;

@ManagedBean(name="c")
@ApplicationScoped
public class ControllerC {
  public String doNavigation() {
    if (Math.random() > 0.5) {
      return("victory");
    } else {
      return("defeat");
    }
  }
}
