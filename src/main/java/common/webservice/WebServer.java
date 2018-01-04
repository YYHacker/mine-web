package common.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebServer {
	
	public void testMethod(String in){
		System.out.println(in);
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/webService/test", new WebServer());
		System.out.println("webservice publish complate!");
	}
}
