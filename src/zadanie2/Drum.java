package zadanie2;

import zadanie2.Tool;

public class Drum implements Tool {
    String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play drum with size: " + size);
    }
}