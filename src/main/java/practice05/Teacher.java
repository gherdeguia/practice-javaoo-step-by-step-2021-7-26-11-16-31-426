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


    @Override
    public String introduce(){
        //return "I am a Student. I am at Class "+this.klass+".";
        //return "My name is "+super.name+". I am "+super.age+" years old. I am a Student. I am at Class "+this.klass+".";
        if(this.klass != null){
            return "My name is "+super.name+". I am "+super.age+" years old. I am a Teacher. I teach Class "+this.klass+".";
        }else{
            return "My name is "+super.name+". I am "+super.age+" years old. I am a Teacher. I teach No Class." ;
        }

        //>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
        //>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.

    }
}
