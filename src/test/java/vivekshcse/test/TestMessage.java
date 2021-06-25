package vivekshcse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vivekshcse.Message.Message;

public class TestMessage {
     
//	Declare Variable
	private  Message m;
	private String expected;
	private String actual;
	
	//provide init-data
	@BeforeEach
	public void setup() {
		m = new Message();
		expected  = "WELCOME: VIVEK";
		actual = "";
	}
	
//	Do unit test
	@Test
	public void testShowMsg() {
		actual = m.showMsg("VIVEK");
		assertEquals(expected, actual, "Name is not match");
	}
	
//	clear heap data /clear memory
	public void clean() {
		m = null;
		expected = actual = null;
	}
	
	
}
