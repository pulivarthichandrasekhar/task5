package log4j;

import static org.junit.Assert.*;
import org.junit.Test;
public class SimpleintrestcompoundintrestTest {

	@Test
	public void test() {
		Simpleintrestcompoundintrest sici =new Simpleintrestcompoundintrest();
		assertEquals(10.0,sici.SI(10.00,10.00,10.00),0);
		assertEquals(1223.9999771118164,sici.CI(1200,2,1),0);	
	}

}
