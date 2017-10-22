package coreservlets;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("flow3")
public class Flow3Bean extends Flow2Bean {
  private static final long serialVersionUID = 1L;
}
