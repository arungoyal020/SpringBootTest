import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gradle.springboot.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testSomeLibraryMethod() {
		HelloWorld  hw = new HelloWorld();
		assertTrue("someLibraryMethod should return 'true'", hw.getBoolean());
	}

}
