package mipt.sbt;

import java.util.concurrent.Callable;

/**
 * Created by Violetta on 30/11/2018.
 */
public class TaskMain {

    public static void main(String[] args) throws Exception {
        Callable<Integer> callable = ()-> {
            Thread.sleep(3000);
            return 1;
            //throw new RuntimeException();
        };

        Task<Integer> task = new TaskImpl<>(callable);

        TaskMain main = new TaskMain();
        for (int i=0;i<10;i++){
            Thread t = new Thread(()->{
                try {
                    main.runTask(task);
                } catch (Exception e) {
                   new RuntimeException(e);
                }
            });
            t.start();
        }
    }

    public void runTask(Task<Integer> task) throws Exception {
        Integer integer = task.get();
        System.out.println(integer+": "+Thread.currentThread().getName());
    }
}
