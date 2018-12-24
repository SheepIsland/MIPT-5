package mipt.sbt.executionmanager;

/**
 * Created by Violetta on 24/12/2018.
 */
public class MyExecutionManager implements ExecutionManager {
    @Override
    public Context execute(Runnable callback, Runnable... tasks) {
        ThreadPool threadPool = new ThreadPool(10, callback, tasks);
        for (Runnable task: tasks) {
            threadPool.execute(task);
        }
        Context context = new Context() {
            @Override
            public int getCompletedTaskCount() {
                return threadPool.getCompletedTask();
            }

            @Override
            public int getFailedTaskCount() {
                return threadPool.getFailedTask();
            }

            @Override
            public int getInterruptedTaskCount() {
                return threadPool.getInterruptedTask();
            }

            @Override
            public void interrupt() {
                threadPool.interrupt();
            }

            @Override
            public boolean isFinished() {
                return threadPool.isFinished();
            }
        };
        return context;
    }
}
