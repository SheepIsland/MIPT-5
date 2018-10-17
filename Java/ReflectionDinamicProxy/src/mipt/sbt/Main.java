package mipt.sbt;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	    Car car = new Car("Car","USA",5,"black", 100,5000,false);
	    Person me = new Person();
	    BeanUtils.assign(car,me);
        System.out.println(me.toString());

    }
}
