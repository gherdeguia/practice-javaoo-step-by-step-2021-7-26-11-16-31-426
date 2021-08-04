package practice05;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass){
        super(name,age);
        this.klass = klass;
    }

    public int getKlass(){
        return this.klass;
    }

    @Override
    public String introduce(){
        if(this.klass != null){
            return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach Class "+this.klass+".";
        }else{
            return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach No Class." ;
        }
    }
}
