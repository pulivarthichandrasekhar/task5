package log4j;

import static org.junit.Assert.*;
import org.junit.Test;
public class HouseRentTest {

	@Test
	public void test() {
		HouseRent hrobj =new HouseRent();
		assertEquals(2400.00,hrobj.cc("standard",2.0),0);
		assertEquals(3000.00,hrobj.cc("abovestandard",2.0),0);
		assertEquals(3600.00,hrobj.cc("highstandard",2.0),0);
	}

}