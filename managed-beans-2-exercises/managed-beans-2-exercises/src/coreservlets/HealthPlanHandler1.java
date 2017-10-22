package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class HealthPlanHandler1 {
  protected String employeeName="Joe User", 
                   employeeId="a1234", 
                   healthPlanName="CareFirst";

  public String getEmployeeName() {
    return(employeeName);
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeId() {
    return(employeeId);
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getHealthPlanName() {
    return(healthPlanName);
  }

  public void setHealthPlanName(String healthPlanName) {
    this.healthPlanName = healthPlanName;
  }
  
  public String doRegistration() {
    if (isAnyEmpty(employeeName, employeeId, healthPlanName)) {
      return("missing-data");
    } else {
      return("confirm-registration-1");
    }
  }
  
  protected boolean isAnyEmpty(String... inputElements) {
    for(String s: inputElements) {
      if ((s == null) || (s.trim().isEmpty())) {
        return(true);
      }
    }
    return(false);  
  }
}
