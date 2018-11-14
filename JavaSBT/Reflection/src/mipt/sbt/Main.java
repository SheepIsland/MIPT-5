package mipt.sbt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
	// write your code here
        ArrayList<Object> persons = new ArrayList<>();
        Person child1 = new Child("child1",10);
        Person child2 = new Child("child2", 11);
        persons.add(child1);
        persons.add(child2);

        System.out.println(new ToCSVConverter().converter(persons));
        ReflectionUtils.printAllFields(child1);
    }
}
