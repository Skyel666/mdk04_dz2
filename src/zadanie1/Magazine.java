package zadanie1;

import zadanie1.Printable;

public class Magazine implements Printable {

    String theName;

    public Magazine(String theName){
        this.theName = theName;
    }
    @Override
    public void print() {
        System.out.println(theName);
    }

    public static void printMagazines(Printable[] printable){
        System.out.println("Magazines: ");
        for (Printable print : printable){
            if (print instanceof Magazine){
                print.print();
            }
        }
    }

}