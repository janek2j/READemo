/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Property;

/**
 * @author Janek
 *
 */
public class PropertyTest {
	
	Property property;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		property = new Property();
	}

	@Test
	public void test() {
		assertEquals("flat", property.getType());
		
		//fail("Not yet implemented");
	}

}
