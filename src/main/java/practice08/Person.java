package practice08;

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

    public boolean isEqualTo(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Person p1 = (Person)obj;
        return this.ID == p1.ID;
    }

}
