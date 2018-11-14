package mipt.sbt;

/**
 * Created by Violetta on 14.09.2018.
 */
public interface Person {

   boolean marry(Person person);

   boolean divorce();

   Person getSpouse();

   Gender getGender();

}
