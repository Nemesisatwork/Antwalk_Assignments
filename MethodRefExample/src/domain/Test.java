package domain;

public class Test {
    public static void main(String[] args) {
        Lecture l = new Lecture();
        Noteable n = l::noteALecture;
        n.note("Physics");

        // method calling
        Blog b = new Blog();
        Noteable n1 = b::blogging;
        n1.note("Travel");

        // staic function invoking
        Noteable web = Webinar::live;
        web.note("ChatGPT");

        // constructor invoking
        Doable dd = Work::new;
        dd.do1("Job");

        // Cricket
        Cricket c = new Cricket();
        Tournament t = c::playCricket;
        t.game("Sachin");

        // Football
        Football f = new Football();
        Tournament t1 = f::playFootball;
        t.game("Ronaldo");

        // Hockey
        Hockey h = new Hockey();
        Tournament t2 = h::playHockey;
        t.game("No idea");
    }
}
