package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	Account c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new Account(1122);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public final void testDeposit() {
		int x = 
	}

}
