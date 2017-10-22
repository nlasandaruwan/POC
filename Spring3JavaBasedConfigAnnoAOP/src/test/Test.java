package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import source.Magician;
import source.Volunteer;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(resource.AppConfig.class);
		Volunteer v = (Volunteer) ctx.getBean(Volunteer.class);
//		System.out.println(v.getThoughts());
//		System.out.println(v.getRate());
//		System.out.println(v.getBatten());
//		System.out.println(v.getVolanteeEmail());
		
		Magician m = (Magician) ctx.getBean(Magician.class);
		System.out.println(m.getMagicBatten().getLength());
		System.out.println(m.sayMagicAnno());
	}

	public void knightShouldEmbarkOnQuest() {

	}
}
