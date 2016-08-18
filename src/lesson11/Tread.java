package lesson11;

/**
 * Created by Student on 15.08.2016.
 */
public class Tread {
    public static void main(String[] args){

        SomeTask st = new SomeTask();
      //  for(int i=0; i<4; i++) {
             Thread t1 =   new Thread(st);
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 =   new Thread(st);
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 =   new Thread(st);
        t3.setPriority(Thread.MAX_PRIORITY);
          //  }
       // st.start();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("end of main programm");


    }
}
