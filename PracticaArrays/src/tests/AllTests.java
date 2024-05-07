package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  
  
})
public class AllTests {

	public static Test suite() {
	      TestSuite suite = new TestSuite("Test for com.chuidiang.ejemplos");
	      suite.addTestSuite(testMediasNotas.class);
	      suite.addTestSuite(testMediasNotasInvalidas.class);
	      return suite;
	   }
}
