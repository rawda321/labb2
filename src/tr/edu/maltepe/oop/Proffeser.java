package tr.edu.maltepe.oop;

public class Proffeser extends Person {

   private String prof_name;


   public Proffeser() {

    }

    public void setProName (String pi) {

        prof_name = pi;
    }

    public int getproName() {

       return prof_name;

    }
    void teaches () {

        System.out.println("prof"+prof_name+"is teaching now" );
    }
}


