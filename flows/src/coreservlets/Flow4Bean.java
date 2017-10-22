package coreservlets;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("fourth-flow")
public class Flow4Bean extends Flow2Bean {
  private static final long serialVersionUID = 1L;
}
