package entities.es1;

public class Rectangles {
    private int height;
    private int width;

    public Rectangles(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void perimeterRectangle() {
        System.out.println("The perimeter of your rectangle is: " + ((this.height + this.width)*2));
    }
    public void areaRectangle() {
        System.out.println("The area of your rectangle is: " + (this.height * this.width));
    }
}
