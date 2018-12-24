package mipt.sbt.executionmanager;

/**
 * Created by Violetta on 24/12/2018.
 */
public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        ExecutionManager executionManager = new MyExecutionManager();
        Runnable[] futures = new Runnable[100];
        for (int i = 0; i < futures.length; i++) {
            futures[i] = (() -> new Integer(0));
        }
        Runnable callback = () -> {
            System.out.println("END");
        };
        Context context = executionManager.execute(callback, futures);
        Thread.sleep(2000);
        System.out.println("Completed"+context.getCompletedTaskCount());
        System.out.println("Failed"+context.getFailedTaskCount());

    }
}
