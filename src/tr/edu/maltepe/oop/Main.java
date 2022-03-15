package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Person obj0 = new Person();
        Proffeser obj1 = new Proffeser();
        Student obj2 = new Student();


        obj0.setName("ensar");
        //obj0.getName();
        System.out.println(obj0.getName());

        obj0.setName1("Rawda");
        //obj0.getName1();
        System.out.println(obj0.getName1());
        obj2.setstu_ID(867565);
        System.out.println(obj2.getstu_ID());

        System.out.println("Ahmed");

        obj1.setPro_ID(928200);
        System.out.println(obj1.getpro_ID());



    }
}