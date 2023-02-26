package zadanie1;

import zadanie1.Printable;

public class Main {
    public static void main(String[] args) {
        Book ABC = new Book("ABC");
        Book PeaceIsLove = new Book("Peace Is Love");
        Magazine TopGear = new Magazine("Top Gear");
        Magazine Maxim = new Magazine("Maxim");

        Printable[] printable;
        printable = new Printable[] {
                ABC, PeaceIsLove, TopGear, Maxim
        };

        for (Printable print : printable){
            print.print();
        }

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}