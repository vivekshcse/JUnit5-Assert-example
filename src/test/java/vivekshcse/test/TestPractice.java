package vivekshcse.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestPractice {

	
	@Test
	public void testArray() {
		int expected[] = {10,20};
		int actual[]= {10,20};
		
//		to compare array
		assertArrayEquals(expected, actual, "may not samme");
	}
	
}
