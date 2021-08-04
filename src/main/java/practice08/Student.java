package practice08;

public class Student extends Person{

    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
        //this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public int getKlassNo(){ return this.klass.getNumber(); }


    public String introduceWith(practice06.Student student){
        return this.introduce();
    }
    @Override
    public String introduce(){
        if(this.klass != null && this.klass.getLeader() != null){
            return generateIntroString() + " I am Leader of Class "+this.klass.getNumber()+".";
        }else if(this.klass != null && this.klass.getLeader() == null) {
            return generateIntroString() + " I am at Class "+this.klass.getNumber()+".";
        }
        else{
            return generateIntroString() + " I teach No Class." ;
        }
    }

    public String generateIntroString(){
        return super.introduce() + " I am a Student.";
    }
}
