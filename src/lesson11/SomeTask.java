package lesson11;

import java.util.ArrayList;

/**
 * Created by Student on 15.08.2016.
 */
public class SomeTask  implements Runnable {
    @Override
    public void run() {
       // Thread.sleep(5);
        for (int i = 0; i < 3; i++) {
            System.out.println("st:"+Thread.currentThread().getName()+ "("+i+")");
        }
    }

    public static void main(String[] args) {
        SomeTask st = new SomeTask();
        Thread t = new Thread(st);

        t.start();
        System.out.println("1:"+t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2:"+ t.isAlive());

        // ArrayList<Thread>  List = new ArrayList<>();
       // for(int i=0; i<4; i++) {
        //    List.add(new Thread(st));
       // }
       // List.forEach(Thread::start);
       // for(int i=0; i<4; i++) {
       //      new Thread(st).start();
      //  }
       // t.start();
        System.out.println("End of main programm");
        //t.run();
    }

}

