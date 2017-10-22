package test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.Magician;
import source.Volunteer;
import source.exclude.Excluded;
import source.include.Included;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/resource/config.xml");
		Volunteer v = (Volunteer) ctx.getBean("volunteer");
		System.out.println(v.getThoughts());
		System.out.println(v.getRate());
		
		System.out.println(v.getMagician().getDoMagic());
		System.out.println(v.getMagician().getEmail());
		
		Magician m = (Magician) ctx.getBean("max");
		System.out.println(m.getDoMagic());
		
		Included include = (Included) ctx.getBean("include");
		System.out.println(include.getInclude());
		
		Excluded exclude = (Excluded) ctx.getBean("excluded");
		System.out.println(exclude.getExclude());
	}
	
	public void knightShouldEmbarkOnQuest() {
	
	}
}