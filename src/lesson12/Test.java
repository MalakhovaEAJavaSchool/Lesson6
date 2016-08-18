package lesson12;

/**
 * Created by Student on 18.08.2016.
 */
public class Test implements Runnable {
    private boolean endFlag = false;
    public  void end() {
        setEndFlag(true);

    }

    public void run(){
        while(!endFlag){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
    }

    public synchronized  boolean isEndFlag() {
        return endFlag;
    }

    public synchronized void setEndFlag(boolean endFlag) {
        this.endFlag = endFlag;
    }
}
