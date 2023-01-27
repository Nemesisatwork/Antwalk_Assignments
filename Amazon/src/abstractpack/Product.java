package abstractpack;

public class Product implements Promotable, Transferrable {
    public void transfer() {
        System.out.println("Product is transferred");
    }

    public void promote() {
        System.out.println("Products are cheaper under promotion");
    }
}
