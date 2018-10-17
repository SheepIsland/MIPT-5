package mipt.sbt;

/**
 * Created by Violetta on 18/10/2018.
 */
public class Person {
    private String name;
    private String country;
    private Integer age;
    private String surname;
    private String sex;
    private Integer weight;
    private Boolean isMarried;

    public Person(String name, String country, Integer age, String surname, String sex, Integer weight, Boolean isMarried) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.surname = surname;
        this.sex = sex;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", isMarried=" + isMarried +
                '}';
    }
}
