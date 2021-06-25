package vivekshcse.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vivekshcse.util.DBConnection;

public class TestDBConnection {
//	Declare Variable
    private DBConnection dbc ;
	private Connection con = null;
	
	//provide init-data
	@BeforeEach
	public void initData() {
		 dbc = new DBConnection();
	}
	
//	Do unit test
	@Test
	public void testGetConnection() {
		
		assertDoesNotThrow(()->{
			con = dbc.getConnection();
		});
		
//		Expected con is not null
		assertNotNull(con,"Connection is not created please check.");
	}
	// this method to clean heap data/memory
	@AfterEach
	public void clean() {
		dbc = null;
		con = null;
	}
	
	
//	assertNotNull(object) : This method is used to specify that givin object is not 
//	a null value it holds data some data, else TEST FAIL.
}
