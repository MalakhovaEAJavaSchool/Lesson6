package lesson12;

/**
 * Created by Student on 18.08.2016.
 */
public class Monitor implements Runnable{
    private String message;

    public void doMessage() {

        try {
            synchronized (this){
            wait();
                System.out.println(message);
                this.message = null;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void sendMessenge(String message){
        synchronized (this){
            this.message = message;
            notify();
        }
    }

    @Override
    public void run() {
        doMessage();
    }
}