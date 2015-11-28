import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


	public class BooksTest{
		private Books book1;
		private Books book2;


	@Before
	public void setUp() throws Exception {
		book1 = new Books("Great Gatsby");
		book2 = new Books("Programming in Java", "Liang");
	}

	@Test 
	public void testBookCheckout(){
		fail("Not yet implemented");
	}

	@Test
	public void testBookReturn(){
		fail("Not yet implemented");
	}

	@Test 
	public void test(){
		fail("Not yet implemented");
	}
}