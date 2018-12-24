package mipt.sbt.executionmanager;

/**
 * Created by Violetta on 24/12/2018.
 */
public interface Context {
    /**
     *
     * @return количество тасков, которые на текущий момент выполнились
     */
    int getCompletedTaskCount();

    /**
     *
     * @return количество тасков, при выполнении которых произошел Exception
     */
    int getFailedTaskCount();

    int getInterruptedTaskCount();

    /**
     * отменяет выполнение тасков, которые еще не начали выполняться
     */
    void interrupt();

    /**
     * вернет true если все такси были выполнены или отменены, false иначе
     * @return
     */
    boolean isFinished();
}
