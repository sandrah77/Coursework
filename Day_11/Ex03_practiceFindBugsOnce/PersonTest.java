import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest { 
	
	@Test
	public void testsNormalName() {
		PersonMain p = new PersonMain();
		String input = "Dereck Robert Yssirt"; 
		String output = p.getInitials(input); 
		String expected = "DRY"; 
		assertEquals(expected, output);
		} 
}