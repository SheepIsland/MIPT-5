package mipt.sbt;

/**
 * Created by Violetta on 18/10/2018.
 */
public class Car {
    private String name;
    private String country;
    private Integer age;
    private String color;
    private Integer mileage;
    private Integer weight;
    private Boolean isNew;

    public Car(String name, String country, Integer age, String color, Integer mileage, Integer weight, Boolean isNew) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.color = color;
        this.mileage = mileage;
        this.weight = weight;
        this.isNew = isNew;
    }

    public Car(){

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
}
