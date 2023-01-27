package org;

public class Sample {
    private static Sample x = new Sample();

    private Sample() {

    }

    public static Sample getSample() {
        return x;
    }

    public void show() {
        System.out.println("Showing");
    }
}
