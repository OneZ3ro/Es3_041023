package entities.es1;

public class Rectangles {
    private int height;
    private int width;

    public Rectangles(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void perimeterRectangle() {
        if (this.height > 0 && this.width > 0) {
            System.out.println("The perimeter of your rectangle is: " + ((this.height + this.width) * 2));
        } else {
            System.out.println("You can not have a height or a width equal to 0!");
        }
    }
    public void areaRectangle() {
        if (this.height > 0 && this.width > 0) {
            System.out.println("The area of your rectangle is: " + (this.height * this.width));
        } else {
            System.out.println("You can not have a height or a width equal to 0!");
        }

    }
}
