package common.webservice.impl;

import javax.jws.WebService;

import common.webservice.OrderWebService;

@WebService(endpointInterface="common.webservice.OrderWebService",serviceName="OrderWebService")
public class OrderWebServiceImpl implements OrderWebService {

	@Override
	public String sayHello(String name) {
		 System.out.println("WebService sayHello " + name);
	     return "Hello " + name + ", nice to meet you.";
	}
}
