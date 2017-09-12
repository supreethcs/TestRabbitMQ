import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
//import java.*;

public class HelloWorld {
    public static void  main(String[] args) throws Exception {
        //System.out.println("Hello World");
        Send sendMessageObj = new Send();
        sendMessageObj.sendMessage("Test Message 5");
        sendMessageObj.sendMessage("Test Message 6");
        sendMessageObj.sendMessage("Test Message 7");
        sendMessageObj.sendMessage("Test Message 8");


        //Receive receiveObj = new Receive();
        //receiveObj.receiveMessage();

    }
}
