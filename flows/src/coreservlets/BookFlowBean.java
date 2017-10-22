package coreservlets;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("shop")
public class BookFlowBean implements Serializable {
  private static final long serialVersionUID = 1L;
  private DailyBookSpecial special1 = BookUtils.special1(), 
                           special2 = BookUtils.special2();
  
  
  public DailyBookSpecial getSpecial1() {
    return(special1);
  }

  public DailyBookSpecial getSpecial2() {
    return(special2);
  }

  public double getTotalCost() {
    return(special1.getTotalCost() + special2.getTotalCost());
  }
  
  public String getTotalDollars() {
    return(BookUtils.toDollars(getTotalCost()));
  }
  
  public String doOrder() {
    if (getTotalCost() <= 0) {
      FacesContext context = FacesContext.getCurrentInstance();
      FacesMessage fMessage = 
        new FacesMessage("You must order at least one book");
      fMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
      context.addMessage(null, fMessage);
      return(null);
    } else {
      return("cart");
    }
  }
}
