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
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.BookBean;
import bean.account.Account;

public class Test2 extends TestCase {

	private static String prefix = "/config";
	private static String[] paths = { prefix + "/JMS-beans-main.xml" };

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext(
			paths);

	private static void createJdbcSecureContext(final ApplicationContext ctx,
			final String username, final String password) {

		AuthenticationProvider jdbcAuthenticationProvider = (AuthenticationProvider) ctx
				.getBean("jdbcAuthenticationProvider");
		
		Authentication jdbcAuthentication = jdbcAuthenticationProvider
				.authenticate(new UsernamePasswordAuthenticationToken(username,
						password));
		
		SecurityContextHolder.getContext()
				.setAuthentication(jdbcAuthentication);
	}
	
	private static void createInMemorySecureContext(
			final ApplicationContext ctx, final String username,
			final String password) {

		AuthenticationProvider inMemoryAuthenticationProvider = (AuthenticationProvider) ctx
				.getBean("inMemoryAuthenticationProvider");
		
		Authentication inMemoryAuthentication = inMemoryAuthenticationProvider
				.authenticate(new UsernamePasswordAuthenticationToken(username,
						password));
		
		SecurityContextHolder.getContext().setAuthentication(
				inMemoryAuthentication);
	}


	// Clear the security context after each test.
	public void teardown() {
		SecurityContextHolder.setContext(new SecurityContextImpl());
	}

	// There are three methods with three roles Which means that I need
	// nine tests.

	/*public void testManagerAccessForSet() {
		createSecureContext(ctx, "sandaruwan", "passsword");
		((BookBean) ctx.getBean("bookBean")).setValue(100);
	}*/

	public void testWorkerAccessForSet() {
		createJdbcSecureContext(ctx, "sandaruwan", "password");
//		try {
			((Account) ctx.getBean("accountBean")).depposit(12222);
//			fail("Expected AccessDeniedException.");
		/*} catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		}*/
	}

	public void testAnonymousAccessForSet() {
		createJdbcSecureContext(ctx, "perera", "axis");
		try {
			double retuen = ((Account) ctx.getBean("accountBean")).withdrow(1006);
//			assertEquals(1007-1006, retuen);
		}/* catch (AccessDeniedException e) {
			System.out.println(e.getMessage());
		} */catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public void testManagerAccessForChange() {
		createSecureContext(ctx, "manager", "manager");
		((BookBean) ctx.getBean("bookBean")).changeValue(100);
	}

	public void testWorkerAccessForChange() {
		createSecureContext(ctx, "worker", "worker");
		((BookBean) ctx.getBean("bookBean")).changeValue(100);
	}*/
}