package name.stojanovki.kosta.urlvalidator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import name.stojanovki.kosta.urlvalidator.MyUriValidator;

@RunWith(Parameterized.class)
public class MyUriValidatorTest {

	private MyUriValidator myValidator = null;
	private String uriTestedNow = null;
	private boolean expectedResult = false;

	public MyUriValidatorTest(String uriTestedNow, boolean expectedResult) {
		this.uriTestedNow = uriTestedNow;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> data() {
		/* First element is the URI, second is the expected result */
		List<Object[]> uriToBeTested = Arrays.asList(new Object[][] { { "http://www.google.com", true },
				{ "file://home/users", true }, { "http://localhost:8080/", false } });

		return uriToBeTested;
	}

	@Before
	public void beforeEachTest() {
		myValidator = new MyUriValidator();
		myValidator.allowFileUrls(true);
		myValidator.allowInternationlizedDomains(false);
		myValidator.allowReservedDomains(false);
		myValidator.allowCustomPorts(true);
	}

	@Test
	public void testCurrentUri() {
		assertEquals("Testing for " + uriTestedNow, expectedResult, myValidator.isValidUrl(uriTestedNow));
	}

}