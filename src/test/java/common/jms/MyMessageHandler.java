package common.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class MyMessageHandler implements MessageListener{

	@Override
	public void onMessage(Message ms) {
		if(ms instanceof TextMessage){
			try {
				System.out.println(((TextMessage)ms).getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			throw new IllegalArgumentException("Message必须为TextMessage类型");
		}
	}

}
