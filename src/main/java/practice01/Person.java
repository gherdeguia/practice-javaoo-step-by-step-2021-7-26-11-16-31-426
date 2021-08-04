package practice01;

public class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    //return String.format("My name is %s. I am %d years old.", name, age);
    //return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
}
