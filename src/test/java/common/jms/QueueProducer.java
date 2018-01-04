package common.jms;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class QueueProducer {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-jms.xml");
		JmsTemplate jmstemplate = (JmsTemplate)context.getBean("jmsTemplate");
		/*jmstemplate.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage ms = session.createTextMessage("你好 customer ，i am productor！");
				return ms;
			}
		});*/
		/*jmstemplate.send((Destination)context.getBean("destination"), new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage ms = session.createTextMessage("你好 customer ，i am productor！");
				return ms;
			}
		});*/
		jmstemplate.convertAndSend("你好，you are my all world!");
	}
}
