package mipt.sbt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Violetta on 17/10/2018.
 */
public class BeanUtils {

    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object from, Object to) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList<String> getters = getGetters(from.getClass());
        getters.retainAll(getSetters(to.getClass()));
        for (String field: getters) {
            Method get = from.getClass().getMethod("get".concat(field));
            Method set = to.getClass().getMethod("set".concat(field),get.getReturnType());
            set.invoke(to, get.invoke(from));
        }
    }

    private static ArrayList<String> getGetters(Class<?> clazz){
        ArrayList<String> getters = new ArrayList<>();
        for (Method method: clazz.getMethods()){
            if (isGetter(method)){
                getters.add(method.getName().substring(3,method.getName().length()));
            }
        }
        return getters;
    }

    private static ArrayList<String> getSetters(Class<?> clazz){
        ArrayList<String> setters = new ArrayList<>();
        for (Method method: clazz.getMethods()){
            if (isSetter(method)){
                setters.add(method.getName().substring(3,method.getName().length()));
            }
        }
        return setters;
    }

    private static boolean isSetter(Method method){
        return  (method.getParameterCount() == 1)&&(method.getName().matches("^set[A-Z].*")) &&
                (method.getReturnType().equals(void.class));
    }

    private static boolean isGetter(Method method){
        return  (method.getParameterCount() == 0)&&(method.getName().matches("^get[A-Z].*")) &&
                (!method.getReturnType().equals(void.class));
    }

}
