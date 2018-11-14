package mipt.sbt;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Violetta on 12/10/2018.
 */
public class ToCSVConverter implements Convert<String> {
    @Override
    public String converter(List<Object> o) throws IllegalAccessException {
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;
        for (Object o1: o) {
            if (isFirst) {
                for (String type:
                        ReflectionUtils.getAllFieldsTypes(o1) ) {

                }
                result.append(ReflectionUtils.getAllFieldsTypes(o1)).append("\n");
                isFirst = false;
            }
            result.append(ReflectionUtils.getAllFieldsValues(o1)).append("\n");
        }
      return result.toString();
    }
}
