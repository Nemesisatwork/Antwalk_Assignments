public class TestThread {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
