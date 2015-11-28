import org.junit.*;
import static org.junit.Assert.*;

public class IntegerQueueTest {
	
	private Queue myQueue;

	// @BeforeClass
	// @AfterClass


	/* @Before
	public void buildUp() {
		myQueue = new IntegerQueue();
	}
	
	@After
	public void tearDown() {
	*/ 
	}

	@Test
	public void insertAndRetrieveIntInEmptyQueueReturnsSameInt() {
		//	Queue myQueue = new IntegerQueue();
			myQueue.insert(111);
			int output = myQueue.retrieve();
			int expected = 111;
			assertEquals(expected, output);
	}
	@Test
	public void insertAndRetrieveThreeIntsInEmptyQueueReturnsSameInts() {
		//	Queue myQueue = new IntegerQueue();
			myQueue.insert(111);
			myQueue.insert(222);
			myQueue.insert(333);
			int output = myQueue.retrieve();
			int expected = 111;
			assertEquals(expected, output);
			output = myQueue.retrieve();
			expected = 222;
			myQueue.insert(55);
			assertEquals(expected, output);
			output = myQueue.retrieve();
			expected = 333;
			assertEquals(expected, output);
			output = myQueue.retrieve();
			expected = 55;
			assertEquals(expected, output);

}