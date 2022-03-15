package tr.edu.maltepe.oop;

public class Student {

    private int stdId;

    public Student(){

    }

    public int getId(){
        return stdId;
    }

    public void setId(int id){
        stdId = id;
    }

    void learns() {
        System.out.println("student Id is"+stdId+"." );

    }
}
