package source.aop.logic;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats() {
		System.out.println("Theaudienceistakingtheirseats.");
	}

	public void turnOffCellPhones() {
		System.out.println("Theaudienceisturningofftheircellphones");
	}

	public void applaud() {
		System.out.println("CLAPCLAPCLAPCLAPCLAP");
	}

	public void demandRefund() {
		System.out.println("Boo!Wewantourmoneyback!");
	}

	public void aroundHello(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("CLAPCLAPCLAPCLAPCLAP");
			System.out.println("The performance took " + (end - start) + " milliseconds.");
		} catch (Throwable t) {
			System.out.println("Boo!Wewantourmoneyback!");
		}
	}
}