package practice09;

public class Klass {


    private final int klassNumber;
    private final String klassName;
    private Student klassLeader;
    private Student klassMember;

    public Klass(){
        this.klassNumber = 0;
        this.klassName = "No Class";

    }
    public Klass(int i){
        this.klassNumber = i;
        this.klassName = "Class "+ i;

    }

    public int getNumber() {
        return klassNumber;
    }
    public String getDisplayName() {
        return klassName;
    }

    public void assignLeader(Student student) {
        this.klassLeader = student;
    }

    public Student getLeader() {
        return this.klassLeader;
    }

    public void appendMember(Student student) {
        this.klassMember = student;
    }


}
