package domain;

public class Course {

    String code;
    Subject[] slist = new Subject[5];

    public Course() {
    }

    public Course(String code, Subject[] slist) {
        this.code = code;
        this.slist = slist;
    }

    // science course
    public void science(String x) {
        System.out.println("The subject is " + x);
    }

    // commerce course
    public void commerce(String x) {
        System.out.println("The subject is " + x);
    }

    // arts course
    public void arts(String x) {
        System.out.println("The subject is " + x);
    }

}
