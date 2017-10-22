package coreservlets;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped // Minor efficiency gain
public class HealthPlanOptions {
  private List<String> planChoices = 
    Arrays.asList("Aetna", "CareFirst", "Kaiser Permanente", "UnitedHealthOne");
  
  public List<String> getChoices() {
    return(planChoices);
  }
}
