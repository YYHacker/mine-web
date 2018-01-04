package common.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
public interface OrderWebService {
	
	//使用@WebMethod注解标注WebServiceI接口中的方法
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
    String sayHello(@WebParam(name="name") String name);

}
