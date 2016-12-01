package test.webservice.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import test.webservice.face.*;
public class WebserviceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaxWsProxyFactoryBean fb = new JaxWsProxyFactoryBean();
        fb.setServiceClass(Sayhello.class);
        fb.setAddress("http://localhost:8080/helloWorld");
        Sayhello sh = (Sayhello) fb.create();
        System.out.println(sh.sayHi("…€∏Á∏Á"));
	}

}
