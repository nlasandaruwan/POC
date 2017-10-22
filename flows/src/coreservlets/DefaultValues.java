package coreservlets;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DefaultValues {
  private String[] emailAddresses =
    { "ellison@microsoft.com", "gates@oracle.com", 
      "page@facebook.com", "zuckerberg@google.com" };

  public String getEmailAddress() {
    return(RandomUtils.randomElement(emailAddresses));
  }

}
