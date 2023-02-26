package zadanie2;

import zadanie2.Tool;

public class Main {
    public static void main(String[] args){
        Guitar bazz = new Guitar(4);
        Drum djembe = new Drum("65");
        Tube piccolo = new Tube(6);

        Tool[] tools = new Tool[] {
                bazz, djembe, piccolo
        };

        for (Tool tool : tools){
            tool.play();
        }
    }
}