package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {

    private Vector books;
    public Library (){
        books =new Vector();

    }


    public void add_book (Javabook ajavabook){
        books.add(ajavabook);
    }

    void List_books() {
        System.out.println("\nname of the books");
        for ( int i = 0; 1<books. size();i++) {
            Javabook temp=(Javabook) books.get(i);
            System.out.println(temp.getbookname());
        }
    }
}