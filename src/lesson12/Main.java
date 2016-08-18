package lesson12;

import java.util.Date;

/**
 * Created by Student on 18.08.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
Account account = new Account(100);
    int x= 3;
        for(int i=0; i<x;i++){
            new Thread(account).start();
        }
*/

/*
        Sqare sqare = new Sqare(2,3,4);

        Thread t1 = new Thread(sqare);
        Thread t2 = new Thread(sqare);

        t1.start();
        t2.start();
        */
        /*
        Test t = new Test();
        Thread t1 = new Thread(t);
        t1.start();
        Thread.sleep(5);
        t.end();
        System.out.println("End of main!");
        */
/*
        Date dat1 = new Date();

        System.out.println(dat1);
        Thread.sleep(2000);
        Man ivan = new Man("Ivan", dat1);
        System.out.println(ivan.getDate());
        dat1.setTime(new Date().getTime() );
        System.out.println(new Date().getTime());
        System.out.println(ivan.getDate());
        ivan.getDate().setTime(0);
*/
        /*
        Test t = new Test();
        Thread tr = new Thread(t);
        tr.start();
        tr.interrupt();
        */
        Monitor monitor = new Monitor();
        Thread t = new Thread(monitor);
        t.start();
        Thread.sleep(5);
        monitor.sendMessenge("Hello!");

    }


}
