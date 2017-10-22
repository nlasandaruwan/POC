package coreservlets;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class CoinFlipper {
  public boolean isHeads() {
    return(Math.random() < 0.5);
  }

}
