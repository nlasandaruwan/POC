package coreservlets;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Named;
import javax.faces.flow.FlowScoped;

@Named
@FlowScoped("first-flow")
public class FirstFlowBean implements Serializable {
  private Date creationTime = new Date();

  public Date getCreationTime() {
    return (creationTime);
  }
}
