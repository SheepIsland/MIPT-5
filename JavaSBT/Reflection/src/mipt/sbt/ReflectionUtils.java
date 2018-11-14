package mipt.sbt;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by Violetta on 12/10/2018.
 */
public class ReflectionUtils {
    public  static void printAllFields(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            for (Field filed:
                    clazz.getDeclaredFields() ) {
                filed.setAccessible(true);
                System.out.println(filed.getName() + "=" + filed.get(o));
            }
            clazz = clazz.getSuperclass();
        }
    }

    public static ArrayList<String> getAllFieldsValues(Object o) throws IllegalAccessException {
        ArrayList<String> fileds = new ArrayList<>();
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            for (Field filed: clazz.getDeclaredFields() ) {
                filed.setAccessible(true);
                fileds.add(filed.get(o).toString());
            }
            clazz = clazz.getSuperclass();
        }
        return fileds;
    }

    public static ArrayList<String> getAllFieldsTypes(Object o) throws IllegalAccessException {
        ArrayList<String> fileds = new ArrayList<>();
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            for (Field filed: clazz.getDeclaredFields() ) {
                filed.setAccessible(true);
                fileds.add(filed.getName());
            }
            clazz = clazz.getSuperclass();
        }
        return fileds;
    }
}
