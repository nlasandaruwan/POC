package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.Volunteer;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/resource/config.xml");
		Volunteer v = (Volunteer) ctx.getBean("volunteer");
		System.out.println(v.getThoughts());
		System.out.println(v.getRate());
		
		System.out.println(v.getMagician().getDoMagic());
		System.out.println(v.getMagician().getEmail());
		
	}
	
	public void knightShouldEmbarkOnQuest() {
	
	}
}