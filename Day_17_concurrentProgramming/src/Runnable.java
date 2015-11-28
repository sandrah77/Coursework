/**
 * Created by Alexander on 25/11/15.
 */
public interface Runnable {


    public void run() {
        Thread newThread = new Thread(myRunnable);
        newThread.start();
    }


}
