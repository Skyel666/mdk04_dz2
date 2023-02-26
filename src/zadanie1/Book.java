package zadanie1;

import zadanie1.Printable;

public class Book implements Printable {

    String theName;
    public Book(String theName){
        this.theName = theName;
    }

    @Override
    public void print() {
        System.out.println(theName);
    }

    public static void printBooks(Printable[] printable){
        System.out.println("Books: ");
        for (Printable print : printable){
            if (print instanceof Book){
                print.print();
            }
        }
    }
}