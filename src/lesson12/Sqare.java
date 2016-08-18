package lesson12;

/**
 * Created by Student on 18.08.2016.
 */
public class Sqare implements Runnable {
    private Object locWidth = new Object();
    private Object locLocation = new Object();

    public Sqare(int y, int x, int width) {
        this.y = y;
        this.x = x;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
public void changeLocation(int x, int y) throws InterruptedException {
    System.out.println("start ");
    synchronized (locLocation) {
        Thread.sleep(5000);
        this.x = x;
        this.y = y;
    }
}
    public void setWidth(int width){
        synchronized (locWidth)
        {
            this.width = width;
        }
    }
    private int width;
    private int x;
    private int y;


    @Override
    public void run() {

    }
}
