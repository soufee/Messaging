import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by admin on 12.05.2017.
 */
public class MyMessageProvider {
    public Connection createConection() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(""+"tcp://localhost:61616");
        return activeMQConnectionFactory.createConnection();
    }
    public void sendMessage(String message){
        try {
            Connection connection = createConection();
            connection.start();
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("MyQueue");
            MessageProducer producer =  session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT); //ВАЖНО!
            TextMessage textMessage = session.createTextMessage(message);
            producer.send(textMessage);
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
