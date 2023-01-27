package methodchaining;

public class Sample {
    int x;

    public void show() {
        System.out.println(x);
    }

    public Sample setX(int a) {
        this.x = a;
        return this;
    }

    public Sample incrementX() {
        this.x++;
        return this;
    }
}
