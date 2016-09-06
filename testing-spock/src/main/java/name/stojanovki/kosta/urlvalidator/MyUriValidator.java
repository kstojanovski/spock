package name.stojanovki.kosta.urlvalidator;

public class MyUriValidator {

	public void allowFileUrls(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void allowInternationlizedDomains(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void allowReservedDomains(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void allowCustomPorts(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public Object isValidUrl(String uriTestedNow) {
		return !uriTestedNow.contains("localhost");
	}

}
