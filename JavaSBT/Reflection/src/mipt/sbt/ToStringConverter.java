package mipt.sbt;

import java.util.List;

/**
 * Created by Violetta on 12/10/2018.
 */
public class ToStringConverter<T> implements Convert<String> {
    @Override
    public String converter(List<Object> o) {
        String s = "";
        for (Object o1: o) {
            s+= o1.toString() + "\n";
        }
        return s;
    }
}
