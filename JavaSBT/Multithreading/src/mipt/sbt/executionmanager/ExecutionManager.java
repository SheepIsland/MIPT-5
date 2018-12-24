package mipt.sbt.executionmanager;

/**
 * Created by Violetta on 24/12/2018.
 */
public interface ExecutionManager {

    /**
     * принимает массив тасков (задания, которые ExecutionManager должен выполнять параллельно)
     * после завершения всех тасков должен выполниться callback ровно один раз
     * Это неблокирубщий метод, который сразу возвращает callback
     * @param callback
     * @param tasks
     * @return
     */
    Context execute(Runnable callback, Runnable...tasks);
}
