/**
 * 
 */
package Test;

import static org.junit.Assert.*;
import model.Owner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Janek
 *
 */
public class OwnerTest {

	/**
	 * @throws java.lang.Exception
	 */
	Owner owner;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		owner = new Owner();
	}

	@Test
	public void test() {
		
		
		assertEquals("FirstName SecondName", owner.name);
		//////////////fail("Not yet implemented");
	}
	
	

}
