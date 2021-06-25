package vivekshcse.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import vivekshcse.util.DBConnectionSingleTon;

public class TestDBConnectionSingleTon {

	@Test
	public void testGetCon() {
		// TODO Auto-generated method stub
		Connection con1 = DBConnectionSingleTon.getCon();
		Connection con2 = DBConnectionSingleTon.getCon();
		
//		----- one condition check-------
		// To check object is not null
		//assertNotNull(con1,"Connection not created");
	
//		----- if you check multiple condition check-------
		if(con1==null || con2==null) {
			
			//TEST CASE IS FAILED
			fail("Connections are not created");
		}
		// To check
		assertSame(con1,con2,"May not be same");

	}
	
	//assertSame(object) : this method is use to check two refrences.
	
}
