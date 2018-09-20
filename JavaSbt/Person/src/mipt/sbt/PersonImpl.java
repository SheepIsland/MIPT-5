package mipt.sbt;

/**
 * Created by Violetta on 14.09.2018.
 */
public class PersonImpl implements Person {
    private final String name;
    private Person spouse;
    private final Gender gender;


    public PersonImpl(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    @Override
    public boolean marry(Person person) {
      if ((this.gender == person.getGender()) || (this.spouse == person)) {
          return false;
      }
      if (this.spouse != null) {
          this.divorce();
      }
      this.spouse = person;
      person.marry(this);
      return true;
    }
    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    @Override
    public boolean divorce() {
        if (this.spouse != null) {
            Person spouse = this.spouse;
            this.spouse = null;
            spouse.divorce();
            return true;
        }
        return false;
    }

    @Override
    public Person getSpouse() {
        return this.spouse;
    }

    public Gender getGender() {
        return gender;
    }

}
