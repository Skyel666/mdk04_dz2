package zadanie2;

import zadanie2.Tool;

public class Tube implements Tool {

    int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Play Tube with diameter: " + diameter);
    }
}