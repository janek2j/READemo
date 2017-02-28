/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Main;

/**
 * @author Janek
 *
 */
public class MainTest {
	
	Main main;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		main = new Main();
		
	}

	@Test
	public void test() {
		
		assertNotNull(main);
		//fail("Not yet implemented");
	}

}
