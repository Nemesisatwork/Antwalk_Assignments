package oopsexample;

public class Mug {

    public void addLiquid(Liquid l) {

        if (l instanceof Milk) {
            l.swirl();
            System.out.println("You got milk");
        }

        else if (l instanceof Tea) {
            l.swirl();
            System.out.println("You got tea");
        }

        else if (l instanceof Coffee) {
            l.swirl();
            System.out.println("You got coffee");
        }

        else
            System.out.println("You got some liquid");
    }
}
