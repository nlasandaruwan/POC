package test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.City;
import source.Magician;
import source.Volunteer;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/resource/config.xml");
		Volunteer v = (Volunteer) ctx.getBean("volunteer");
		System.out.println("v.getThoughts() "+v.getThoughts());
		System.out.println("v.getRate() "+v.getRate());
		System.out.println("v.getBatten() "+v.getBatten());
		System.out.println("v.getVolanteeEmail() "+v.getVolanteeEmail());
//		System.out.println(""+v.isVolunteerPaid());
		System.out.println("v.getNullSafeAssign() "+v.getNullSafeAssign());
		
		Magician m = (Magician) ctx.getBean("magic");
		System.out.println("m.getFromProp() "+m.getFromProp());
		System.out.println("m.getPi() "+m.getPi());
		System.out.println("m.getCityOfMagician().getName() "+m.getCityOfMagician().getName());
		System.out.println("m.getValueFromProperty() "+m.getValueFromProperty());
		
		List<City> bigCities = m.getBigCities();
		for (City city : bigCities) {
			System.out.println("big cities () "+city.getName());
		}
		
	}

	public void knightShouldEmbarkOnQuest() {

	}
}
