package mipt.sbt;

/**
 * Created by Violetta on 30/11/2018.
 */
public class BarrierImpl implements Barrier {

    private int threadCount;
    private int threadsFinished;

    public BarrierImpl(int threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public synchronized void await() {

        ++threadsFinished;
        if (threadsFinished == threadCount){
            this.notifyAll();
        } else {
            while (threadsFinished < threadCount){ //не if !!!
                try {
                    wait(); //только в синхронизированных секциях
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
