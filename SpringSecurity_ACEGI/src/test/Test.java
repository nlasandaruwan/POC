package test;

import junit.framework.TestCase;

import org.acegisecurity.AccessDeniedException;
import org.acegisecurity.Authentication;
import org.acegisecurity.BadCredentialsException;
import org.acegisecurity.DisabledException;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.context.SecurityContextImpl;
import org.acegisecurity.providers.AuthenticationProvider;
import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.BookBean;

public class Test extends TestCase {

	private static String prefix = "/config";
	private static String[] paths = { prefix + "/JMS-beans-main.xml" };

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext(
			paths);

	private static void createSecureContext(final ApplicationContext ctx, final String username, final String password) {
		
//		AuthenticationProvider inMemoryAuthenticationProvider = (AuthenticationProvider) ctx.getBean("inMemoryAuthenticationProvider");
		AuthenticationProvider jdbcAuthenticationProvider = (AuthenticationProvider) ctx.getBean("jdbcAuthenticationProvider");
		
//		Authentication inMemoryAuthentication = inMemoryAuthenticationProvider.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		Authentication jdbcAuthentication = jdbcAuthenticationProvider.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		
//		SecurityContextHolder.getContext().setAuthentication(inMemoryAuthentication);
		SecurityContextHolder.getContext().setAuthentication(jdbcAuthentication);
	}

	// Clear the security context after each test.
	public void teardown() {
		SecurityContextHolder.setContext(new SecurityContextImpl());
	}

	// There are three methods with three roles Which means that I need
	// nine tests.

	public void testManagerAccessForSet() {
		createSecureContext(ctx, "sandaruwan", "passsword");
		((BookBean) ctx.getBean("bookBean")).setValue(100);
	}

	public void testWorkerAccessForSet() {
		createSecureContext(ctx, "perera", "passsword");
		try {
			((BookBean) ctx.getBean("bookBean")).setValue(100);
			fail("Expected AccessDeniedException.");
		} catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void testAnonymousAccessForSet() {
		createSecureContext(ctx, "anonymous", "anonymous");
		try {
			((BookBean) ctx.getBean("bookBean")).setValue(100);
			fail("Expected AccessDeniedException.");
		} catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void testManagerAccessForChange() {
		createSecureContext(ctx, "manager", "manager");
		((BookBean) ctx.getBean("bookBean")).changeValue(100);
	}

	public void testWorkerAccessForChange() {
		createSecureContext(ctx, "worker", "worker");
		((BookBean) ctx.getBean("bookBean")).changeValue(100);
	}

	public void testAnonymousAccessForChange() {
		createSecureContext(ctx, "anonymous", "anonymous");
		try {
			((BookBean) ctx.getBean("bookBean")).changeValue(100);
			fail("Expected AccessDeniedException.");
		} catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void testManagerAccessForGet() {
		createSecureContext(ctx, "manager", "manager");
		((BookBean) ctx.getBean("bookBean")).getValue();
	}

	public void testWorkerAccessForGet() {
		createSecureContext(ctx, "worker", "worker");
		((BookBean) ctx.getBean("bookBean")).getValue();
	}

	public void testAnonymousAccessForGet() {
		createSecureContext(ctx, "anonymous", "anonymous");
		((BookBean) ctx.getBean("bookBean")).getValue();
	}

	public void testDisabledUser() {
		try {
			createSecureContext(ctx, "disabled", "disabled");
			fail("Expected DisabledException.");
		} catch (DisabledException e) {
			System.out.println(e.getMessage());
		}
	}

	public void testUnknownUser() {
		try {
			createSecureContext(ctx, "unknown", "unknown");
			fail("Expected BadCredentialsException.");
		} catch (BadCredentialsException e) {
			System.out.println(e.getMessage());
		}
	}
}
