package lesson12;

import java.io.ObjectOutputStream;

/**
 * Created by Student on 18.08.2016.
 */
public class Account implements Runnable {

    private final Object myLock = new Object();
    public Account(int saldo) {
        this.saldo = saldo;
    }

    private int saldo;
    public  void decreaseSaldo(int sum) throws InterruptedException {
        System.out.println("try decrease saldo");


        synchronized (myLock) {
            if (saldo - sum < 0) {
                System.out.println("Overdraft not avialable");

            } else {
                Thread.sleep(10);
                saldo = saldo - sum;

            }
        }

    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void run() {
        int x = 12;
        for (int i = 0; i < x; i++) {
            try {
                decreaseSaldo(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (getSaldo() < 0) {
                throw new RuntimeException("current account overdrafted!!!");
            }
        }
    }
}
