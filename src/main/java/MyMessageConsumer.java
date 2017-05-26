import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


/**
 * Created by admin on 12.05.2017.
 */
public class MyMessageConsumer {
    public Connection createConection() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(""+"tcp://localhost:61616");
        return activeMQConnectionFactory.createConnection();
    }
   public void recieveMessage(){
       try {
           Connection connection = createConection();
           connection.start();
           Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
           Destination destination = session.createQueue("MyQueue");

           MessageConsumer messageConsumer = session.createConsumer(destination);
           Message message1 = messageConsumer.receive(10000);
           System.out.println(((TextMessage)message1).getText());
           session.close();
           connection.close();
           messageConsumer.close();
       } catch (JMSException e) {
           e.printStackTrace();
       }

   }

}
