package org.test.jsf.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "currentLookupService", eager = true)
@ApplicationScoped
public class CustomerSimpleMapDI extends CustomerSimpleMap {

}
