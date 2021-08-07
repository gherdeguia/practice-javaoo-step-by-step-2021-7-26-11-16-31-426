package practice09;

import java.util.LinkedList;

public class Teacher extends Person {

    private Klass klass;
    private LinkedList<Klass> LLKlass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.LLKlass = linkedList;
    }


    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (this.LLKlass != null) {
            return String.format("%s I teach Class %s.", setIntroductionString(), retrieveListItems(this.LLKlass));
        } else {
            return setIntroductionString() + " I teach No Class.";
        }
    }

    public String retrieveListItems(LinkedList<Klass> linkedList) {
        StringBuilder outputList = new StringBuilder();
        for (Klass list : linkedList) {
            outputList.append(list.getNumber()).append(", ");
        }
        return outputList.delete(outputList.length() - 2, outputList.length() - 1).toString().trim();
    }

    public String introduceWith(Student student) {
        if (isTeacherSameWithStudentKlass(this.LLKlass, student)) {
            return this.setIntroductionString() + " I teach " + student.getName() + ".";
        } else {
            return this.setIntroductionString() + " I don't teach " + student.getName() + ".";
        }

    }

    private String setIntroductionString() {
        return super.introduce() + " I am a Teacher.";
    }

    public LinkedList<Klass> getClasses() {
        return this.LLKlass;
    }

    public boolean isTeaching(Student student) {
        for (Klass list : this.LLKlass) {
            if (list.getNumber() == student.getKlassNo()) {
                return true;
            }
        }
        return false;
    }

    public boolean isTeacherSameWithStudentKlass(LinkedList<Klass> linkedList, Student student) {
        for (Klass klasses : linkedList) {
            if (klasses.getNumber() == student.getKlassNo()) {
                return true;
            }
        }
        return false;
    }
}
