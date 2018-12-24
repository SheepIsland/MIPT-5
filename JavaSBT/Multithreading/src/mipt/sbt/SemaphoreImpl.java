package mipt.sbt;

/**
 * Created by Violetta on 30/11/2018.
 */
public class SemaphoreImpl implements Semaphore{

    private final int threadCount;
    private int threadsInside;

    public SemaphoreImpl(int count) {
        this.threadCount = count;
    }

    @Override
    public synchronized void acquire() {
        while (threadsInside >= threadCount){ //не if !!!
            try {
                wait(); //только в синхронизированных секциях
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ++threadsInside;
    }

    public void await(){

    }

    @Override
    public synchronized void release() {
        --threadsInside;
        this.notify();
    }

    public void doNotify(){

    }
}
