package test.webservice.app;

import javax.xml.ws.Endpoint;
import test.webservice.impl.*;
public class WebserviceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Endpoint.publish("http://localhost:8080/helloWorld",new SayhelloImpl());
	}

}
