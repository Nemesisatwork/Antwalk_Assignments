package prod;

public class Magazine extends Book {

    int issueYear;

    public Magazine(int id, String name, String brand, int bookID, int issueYear) {

        super(id, name, brand, bookID);
        this.issueYear = issueYear;
        System.out.println("Magazine is called");
    }

    public void display() {
        System.out.println("the details are - \nID - " + id + "\nName - " + name + "\nBrand - " + brand + "\nBook ID - "
                + bookID + "\nIssue Year - " + issueYear);
        System.out.println("\nOriginal Price - " + price + "\nMagazine discounted price - " + (price - price * 0.2));
    }
}
