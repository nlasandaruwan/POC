package source.aop.annotated;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Anno {

	@Pointcut("execution (* source.Magician.sayMagicAnno(..))")
	public void pointCut(){
		
	}
	
	@Before("execution (* source.Magician.sayMagicAnno(..))")
	public void silenceCellPhones() {
		System.out
				.println(" ----------------       Silencing cell phones ------------  ");
	}

	@Before("pointCut()")
	public void takeSeats() {
		System.out
				.println(" ----------------       Taking seats ------------  ");
	}

	@AfterReturning("execution (* source.Magician.sayMagicAnno(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
}
