package prod;

public class Electronic extends Product {
    String type;

    public Electronic(int id, String name, String brand, String type) {

        super(id, name, brand);
        this.type = type;
        System.out.println("Electronic is called");
    }

}
