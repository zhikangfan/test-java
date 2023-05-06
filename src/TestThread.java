//import java.util.*;
public class TestThread {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        t.start();


        System.out.println("end");
        try {
            t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("end-1");
    }
}

//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("start new Thread");
//    }
//}