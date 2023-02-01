package domain;

public class Professor extends Subject {
    String pName;
    Subject sub;

    public Professor(String pName, Subject sub) {
        this.pName = pName;
        this.sub = sub;
    }

}
