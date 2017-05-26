/**
 * Created by admin on 12.05.2017.
 */
public class MainProvider {
    public static void main(String[] args) {
   MyMessageProvider provider = new MyMessageProvider();
   provider.sendMessage("Hi dear");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//
//        Thread producerThread = new Thread(() ->{
//            MyMessageProvider producer = new MyMessageProvider();
//
//            producer.sendMessage("Hello");
//        });
//
//        Thread consumerThread = new Thread(() -> {
//            MyMessageConsumer consumer = new MyMessageConsumer();
//
//            consumer.recieveMessage();
//        });
//
//        producerThread.start();
//        consumerThread.start();
//
//
//        try {
//            producerThread.join();
//            consumerThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    }

