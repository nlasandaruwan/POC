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

public class JavaFlowBuilder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Produces
  @FlowDefinition
  public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
    String flowId = "flow-using-java";
    flowBuilder.id("", flowId);
    flowBuilder.viewNode(flowId, "/java-flow/java-flow-start-page.xhtml")
               .markAsStartNode();
    flowBuilder.viewNode("first-page", "/java-flow/page1.xhtml");
    flowBuilder.viewNode("second-page", "/java-flow/page2.xhtml");
    flowBuilder.viewNode("third-page", "/java-flow/page3.xhtml");
    flowBuilder.returnNode("exit-java-flow")
               .fromOutcome("/java-flow-return-page");
    return(flowBuilder.getFlow());
  }
}
