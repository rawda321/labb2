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
    public void readBook(Javabook ajavabook) {
        System.out.println("Student learns java using Javabooks");
    }
    public void borrow1(String ajavabook) {
        System.out.println("student borrowed"+ajavabook+".");
        int z =0;
    }
    public void borrow2(String Javabook3) {
        System.out.println("student borrowed"+Javabook3+".");
        int y=0;
    }
    public void return1(String ajavabook) {
        System.out.println("student returned"+ajavabook+".");
        int z = 1;
    }
    public void return2(String Javabook3) {
        System.out.println("student returned"+Javabook3+".");
        int y = 0;
    }

}
