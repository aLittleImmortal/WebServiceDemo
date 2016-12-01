package test.webservice.face;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Sayhello {
	 String sayHi(@WebParam(name="text")String text);
}
