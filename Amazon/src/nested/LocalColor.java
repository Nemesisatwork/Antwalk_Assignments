package nested;

public class LocalColor {
    String colorType;

    public LocalColor(String colortype) {
        this.colorType = colortype;
    }

    public void guessColor() {
        class Color {
            void getColor() {
                System.out.println("The color is - " + colorType);
            }
        }

        Color c = new Color();
        c.getColor();
    }
}
