package coreservlets;

import javax.faces.bean.*;

@ManagedBean(name="a")
@ApplicationScoped
public class ControllerA {
  /** Trace the constructor to verify really application scoped. 
   *  Look in the Java console to see the printouts. */
  public ControllerA () {
    System.out.println("ControllerA (bean name 'a') instantiated.");
  }
  
  public String doNavigation() {
    if (Math.random() > 0.5) {
      return("b");
    } else {
      return("defeat");
    }
  }
}
