package coreservlets;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("checkout")
public class CheckoutFlowBean extends BookFlowBean {
  private static final long serialVersionUID = 1L;
  private String name, cardType, cardNumber, address, email;
  
  public String getName() {
    return(name);
  }
  
  public void setName(String name) {
    this.name = name;
  }
 
  public String getCardType() {
    return(cardType);
  }
  
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }
  
  public String getCardNumber() {
    return(cardNumber);
  }
  
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
  
  public String getAddress() {
    return(address);
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getEmail() {
    return(email);
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  

}
