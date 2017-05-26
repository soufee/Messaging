/**
 * Created by admin on 12.05.2017.
 */
public class MainConsumer {
    public static void main(String[] args) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyMessageConsumer consumer = new MyMessageConsumer();
        consumer.recieveMessage();
    }
}
