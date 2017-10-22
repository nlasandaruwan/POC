package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class NameOptions {
  private String[] firstNames = { "Cay", "David", "Marty" };
  private Map<String,String> names = new LinkedHashMap<>();
  
  public NameOptions() {
    names.put("Cay", "Cay Horstmann");
    names.put("David", "David Geary");
    names.put("Marty", "Marty Hall");
  }

  public String[] getFirstNames() {
    return(firstNames);
  }

  public Map<String, String> getNames() {
    return(names);
  }
}
