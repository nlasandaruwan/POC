package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class HealthPlanHandler2 extends HealthPlanHandler1 {
  private HealthPlan healthPlan;
  // In Managed Beans 3, we will see how to use dependency injection to
  // avoid referring to concrete plan finder in line below.
  private HealthPlanFinder planFinder = new SimpleChoicesHealthPlanFinder();
  
  public HealthPlan getHealthPlan() {
    return(healthPlan);
  }
  
  @Override
  public String doRegistration() {
    if (isAnyEmpty(employeeName, employeeId, healthPlanName)) {
      return("missing-data");
    } else {
      healthPlan = planFinder.findPlan(healthPlanName);
      if (healthPlan == null) {
        return("unknown-plan");
      } else {
        return("confirm-registration-2");
      }
    }
  }
}
