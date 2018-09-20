package mipt.sbt;

public class Main {

    public static void main(String[] args) {
	    Person tommy = new PersonImpl("Tommy", Gender.MALE);
	    Person mary = new PersonImpl("Mary", Gender.FEMALE);
        System.out.println("Has Tommy wife? - "+tommy.getSpouse());
        System.out.println("Has Mary husband? - "+mary.getSpouse());
        tommy.marry(mary);
        System.out.println("Has Tommy wife? - "+tommy.getSpouse());
        System.out.println("Has Mary husband? - "+mary.getSpouse());
        tommy.divorce();
        System.out.println("Has Tommy wife? - "+tommy.getSpouse());
        System.out.println("Has Mary husband? - "+mary.getSpouse());

    }
}
