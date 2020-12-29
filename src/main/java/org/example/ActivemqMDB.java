package org.example;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "resourceAdapter", propertyValue = "activemq-rar-5.16.0"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "example.q"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ActivemqMDB implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(message);
    }

}
