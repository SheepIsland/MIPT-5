package mipt.sbt;

import java.util.List;

/**
 * Created by Violetta on 12/10/2018.
 */
public interface Convert<T> {
    T converter(List<Object> o) throws IllegalAccessException;
}
