package practice06;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
        //this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public int getKlassNo(){ return this.klass.getNumber(); }


    public String introduceWith(Student student){
        return this.introduce();
    }

    @Override
    public String introduce(){
        if(this.klass != null){
            return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I am at Class "+this.klass.getNumber()+".";
        }else{
            return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I teach No Class." ;
        }
    }
}
