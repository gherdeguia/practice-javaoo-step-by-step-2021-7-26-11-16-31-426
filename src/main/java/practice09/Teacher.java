package practice09;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private Klass klass;
    private LinkedList<Klass> LLKlass;

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

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.LLKlass = linkedList;
    }


    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (this.LLKlass != null) {
            return setIntroductionString() + " I teach Class " + retrieveListItems(this.LLKlass) + ".";
        } else {
            return setIntroductionString() + " I teach No Class.";
        }
    }

    public String retrieveListItems(LinkedList<Klass> linkedList){
        String out = "";
        for (Klass temp: linkedList) {
            out += linkedList.element().getNumber()+", ";
        }
        return out.trim();
//
//        return linkedList.stream()
//                .reduce("", (current, next) -> current + next);
//                .collect(Collectors.toList());
//    }
//      return linkedList.stream().collect(Collectors.toList()).toString();

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
    public LinkedList<Klass> getClasses() {
        return this.LLKlass;
    }
}
