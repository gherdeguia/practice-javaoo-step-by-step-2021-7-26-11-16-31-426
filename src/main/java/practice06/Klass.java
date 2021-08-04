package practice06;

public class Klass {

    private int klassNumber;
    private String klassName;

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
}
