package coreservlets;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("second-flow")
public class SecondFlowBean extends FirstFlowBean {

}
