package mipt.sbt;

/**
 * Created by Violetta on 30/11/2018.
 */
public class BarrierMain {

    private final Barrier barrier = new BarrierImpl(10);
    private final double runningSpeed = 5;
    private double distance = 50;

    public void run(){
        double runningTime;
        try {
           runningTime = doRun(); //запуск потоков
        } finally {
            barrier.await();//все потоки которые дотигли await засыпают пока все не добегут Потом просыпаются
        }
        printRunningTime(runningTime); //печатается когда все потоки прибегут
    }

    public double doRun(){
        double starTime = System.currentTimeMillis();
        double currentDistance = 0;
        while (currentDistance <  distance) {
            currentDistance += runningSpeed;

        }
        return starTime-System.currentTimeMillis();
    }


    public void printRunningTime(double startTime){
        System.out.println(System.currentTimeMillis()-startTime + ": "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        BarrierMain main = new BarrierMain();
        for (int i=0;i<10;i++){
            Thread t = new Thread(()->{
                main.run();
            });
            t.start();
        }
    }
}
