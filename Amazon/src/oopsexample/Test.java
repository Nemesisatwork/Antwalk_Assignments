package oopsexample;

import java.lang.management.MemoryMXBean;

public class Test {

    public static void main(String args[]) {
        Liquid l = new Liquid();
        Milk m = new Milk();
        Tea t = new Tea();
        Coffee c = new Coffee();
        Mug myMug = new Mug();
        myMug.addLiquid(l);
        myMug.addLiquid(t);
        myMug.addLiquid(c);
        myMug.addLiquid(m);

    }
}
