package maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void test(){
		Reporter.log("This is a maven example",true);
	}

}
