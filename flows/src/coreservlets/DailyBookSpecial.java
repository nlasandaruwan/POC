package coreservlets;

import java.io.Serializable;

public class DailyBookSpecial implements Serializable {
  private static final long serialVersionUID = 1L;
  private String title;
  private double price;
  private int orders;
  
  public DailyBookSpecial(String title, double price) {
    this.title = title;
    this.price = price;
  }
  
  public String getTitle() {
    return(title);
  }

  public double getPrice() {
    return(price);
  }
  
  public int getOrders() {
    return(orders);
  }

  public void setOrders(int orders) {
    this.orders = orders;
  }
  
  public double getTotalCost() {
    return(price * orders);
  }

  public String getDollars() {
    return(BookUtils.toDollars(price));
  }
  
  public String getTotalDollars() {
    return(BookUtils.toDollars(getTotalCost()));
  }
}
