package coreservlets;

public class HealthPlanUtils {
  private static HealthPlan[] availablePlans =
    { new HealthPlan("Aetna", "301-123-4567", 1234.56),
      new HealthPlan("CareFirst", "410-321-7654", 1555.55),
      new HealthPlan("Kaiser Permanente", "301-222-3333", 1357.91),
      new HealthPlan("UnitedHealthOne", "410-444-8888", 1333.55)
    };
  
  public static HealthPlan[] getAvailablePlans() {
    return(availablePlans);
  }
  
  public static HealthPlan findPlan(String planName) {
    for(HealthPlan plan: availablePlans) {
      if (plan.getName().equalsIgnoreCase(planName)) {
        return(plan);
      }
    }
    return(null);
  }
  
  private HealthPlanUtils() {} // Non-instantiatable class
}
