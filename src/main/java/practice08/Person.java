package practice08;

import java.util.Objects;

public class Person {

    private final String name;
    private final int age;
    private final int ID;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = 0;
    }

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

}
