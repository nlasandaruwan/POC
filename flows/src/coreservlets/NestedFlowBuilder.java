package coreservlets;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.*;

// See general explanatory comments in FlowBuilder1, and see comments
// below that are specific to the new features of this example.

public class NestedFlowBuilder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Produces
  @FlowDefinition
  public Flow defineCallingFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
    String flowId = "secondJavaFlow";
    flowBuilder.id("", flowId);
    flowBuilder.viewNode(flowId, "/java-calling-flow/start-page.xhtml")
               .markAsStartNode();
    flowBuilder.viewNode("results", "/java-calling-flow/results-page.xhtml");
    flowBuilder.returnNode("return")
               .fromOutcome("/return-page-for-java-calling-flow");
    flowBuilder.returnNode("home")
               .fromOutcome("/index");
    
    // The outcome go-to-nested invokes thirdJavaFlow as a nested flow.
    // When that nested flow is invoked, the current value of javaCallingFlowBean.param1
    // is stored into flowScope.paramForNestedFlow. 
    // The thirdJavaFlow flow needs an inbound-parameter to
    // say where flowScope.paramForNestedFlow should go. 
    flowBuilder.flowCallNode("go-to-nested")
               .flowReference("", "thirdJavaFlow")
               .outboundParameter("paramForNestedFlow", 
                                  "#{javaCallingFlowBean.param1}");
    return(flowBuilder.getFlow());
  }
  
  @Produces
  @FlowDefinition
  public Flow defineNestedFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
    String flowId = "thirdJavaFlow";
    flowBuilder.id("", flowId);
    flowBuilder.viewNode(flowId, "/java-nested-flow/start-page.xhtml")
               .markAsStartNode();
    flowBuilder.viewNode("results", "/java-nested-flow/results-page.xhtml");
    flowBuilder.returnNode("return-to-previous-start")
               .fromOutcome("secondJavaFlow");  
    flowBuilder.returnNode("return-to-previous-results")
               .fromOutcome("results");

    // This means that when this flow is invoked as a nested flow (from
    // secondJavaFlow), the value of flowScope.paramForNestedFlow is
    // passed to the setParam3 method of javaNestedFlowBean. The paramForNestedFlow
    // property is set via an outbound-parameter in the configuration of
    // secondJavaFlow.
    flowBuilder.inboundParameter("paramForNestedFlow", 
                                 "#{javaNestedFlowBean.param3}");
    return(flowBuilder.getFlow());
  }
}
