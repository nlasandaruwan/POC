package coreservlets;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.*;

// IMPORTANT: This code will not be executed on Web app startup unless
// there is a beans.xml file in WEB-INF. The file, however, can be
// empty except for a valid start and end tag.

// It is somewhat traditional to name the method "defineFlow", but that name
// is not mandatory. Any method marked with the right annotations will work.
// You can even define multiple flows in the same class by having more
// than one correctly-annotated method (e.g., defineFlowA, defineFlowB).

// Also, despite what it says in the Java EE 7 tutorial at 
// http://docs.oracle.com/javaee/7/tutorial/doc/jsf-configure003.htm,
// there is NO requirement having to do with the name of the Java class.
// In particular, although it may be CONVENTIONAL to do so, it is not
// REQUIRED that the name of the class match the flow name: that
// is the purpose of the id in the second argument to flowBuilder.id.

// The first argument to flowBuilder.id is the ID of the defining document,
// in case the same flow name is defined in multiple documents, as might
// happen in a very large project with many JAR files. In most projects, an empty
// String (but not null) is supplied.

public class SimpleFlowBuilder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Produces
  @FlowDefinition
  public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
    String flowId = "firstJavaFlow";
    flowBuilder.id("", flowId);
    flowBuilder.viewNode(flowId, "/java-flow-1/start-page.xhtml")
               .markAsStartNode();
    flowBuilder.viewNode("page2", "/java-flow-1/second-page.xhtml");
    flowBuilder.viewNode("page3", "/java-flow-1/third-page.xhtml");
    flowBuilder.switchNode("random-page")
               .defaultOutcome("page3")
               .switchCase().condition("#{coinFlipper.heads}")
                            .fromOutcome("page2");
    flowBuilder.returnNode("exit-java-flow-1")
               .fromOutcome("/return-page-for-java-flow-1");
    return(flowBuilder.getFlow());
  }
}
