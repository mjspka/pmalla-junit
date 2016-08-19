/**
 *
 */
package com.pmalla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author pmalla
 *
 */
// Step 1: Add the annotation with Parameterized.class
@RunWith(Parameterized.class)
public class DataDrivenJunitTest {
	private static final Logger logger = Logger.getLogger(DataDrivenJunitTest.class.getName());

	// Step 2: Add a public static method that can return Collection. Please do not forget to Parameters annotation to this method.
	@Parameters
	public static Collection<String> buildParameters() {
		List<String> parameters = new ArrayList<String>();
		parameters.add("1");
		parameters.add("2");
		parameters.add("3");
		parameters.add("4");
		parameters.add("5");
		parameters.add("6");
		parameters.add("7");
		return parameters;
	}

	// Step 3: Add a class level variable to store the passed in parameter
	private String passedInParameter;

	// Step 4: Add a public constructor to capture the passed in parameters that was build with the function, buildParameters. These parameters will
	// be passed one at a time.
	public DataDrivenJunitTest(String _passedInParameter) {
		this.passedInParameter = _passedInParameter;
	}

	// Step 5: Add a test case
	@Test
	public void testPassedInParameter() {
		logger.info(passedInParameter);
	}
}
