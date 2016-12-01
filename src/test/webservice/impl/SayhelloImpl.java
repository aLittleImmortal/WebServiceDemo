package test.webservice.impl;
import test.webservice.face.Sayhello;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="test.webservice.face.Sayhello",serviceName="HelloWorld")
public class SayhelloImpl implements Sayhello{
	
	public String sayHi(@WebParam(name = "text") String text) {
		// TODO Auto-generated method stub
		return "Hello "+text+" !";
	}
	
	}


