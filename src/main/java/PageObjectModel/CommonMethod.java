package PageObjectModel;

import org.testng.asserts.SoftAssert;

public class CommonMethod {

	
	public static void handleAssersions(String at,String et,String Msg) {
		
		SoftAssert assertions =new SoftAssert();
		assertions.assertEquals(at, et, Msg);
		assertions.assertAll();
	}
	
}
