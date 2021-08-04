package practice05;

public class Student extends Person{

    private int klass;

    public Student(String name, int age) {
        super(name, age);
        //this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass(){
        return this.klass;
    }

    @Override
    public String introduce(){
        //return "I am a Student. I am at Class "+this.klass+".";
        return "My name is "+super.name+". I am "+super.age+" years old. I am a Student. I am at Class "+this.klass+".";
    }
}
