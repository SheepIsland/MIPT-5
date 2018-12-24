package mipt.sbt;

/**
 * Created by Violetta on 30/11/2018.
 */
public interface Task<T> {

    T get() throws Exception;
}
