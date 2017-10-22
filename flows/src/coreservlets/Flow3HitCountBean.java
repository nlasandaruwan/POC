package coreservlets;

import java.io.Serializable;

// If you use @Named instead of @ManagedBean, then you must use the
// CDI (javax.enterprise.context) version of SessionScoped, not
// the JSF version (javax.faces.bean).
// Faces Flow uses CDI consistently.
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Flow3HitCountBean implements Serializable {
  private static final long serialVersionUID = 1L;
  private int hitCount;
  
  public int getCurrentCount() {
    return(hitCount);
  }
  
  public int getIncrementingCount() {
    return(++hitCount);
  }
}
