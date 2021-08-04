package practice09;

import java.util.Collection;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }


    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (this.klass != null) {
            return setIntroductionString() + " I teach Class " + this.klass.getNumber() + ".";
        } else {
            return setIntroductionString() + " I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (this.klass.getNumber() == student.getKlassNo()) {
            return this.setIntroductionString() + " I teach " + student.getName()+".";
        } else {
            return this.setIntroductionString() + " I don't teach " + student.getName()+".";
        }

    }

    private String setIntroductionString() {
        return super.introduce() + " I am a Teacher.";
    }
//
//    public String getClasses() {
//        return this.klass.getClass().;
//    }
}
