package zadanie2;

import zadanie2.Tool;

public class Guitar implements Tool {

    int numStrings;
    public Guitar(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public void play() {
        System.out.println("Play Guitar with strings: " + numStrings);
    }
}