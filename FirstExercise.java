import entities.Rectangles;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--> Which function do you want to run?");
        System.out.println("--> [1] stampRectangle  -  [2] stampTwoRectangles");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                System.out.print("· Type height: ");
                int height = Integer.parseInt(input.next());
                System.out.print("· Type width: ");
                int width = Integer.parseInt(input.next());
                stampRectangle(height, width);
                break;
            case 2:
                System.out.print("· Type height1: ");
                int height1 = Integer.parseInt(input.next());
                System.out.print("· Type width1: ");
                int width1 = Integer.parseInt(input.next());
                System.out.print("· Type height2: ");
                int height2 = Integer.parseInt(input.next());
                System.out.print("· Type width2: ");
                int width2 = Integer.parseInt(input.next());
                stampTwoRectangles(height1, width1, height2, width2);
                break;

            default:
                System.out.println("You did not choose 1 or 2");
        }

        input.close();
    }

    public static void stampRectangle(int a, int b){
        Rectangles singleRectangle = new Rectangles(a, b);
        singleRectangle.perimeterRectangle();
        singleRectangle.areaRectangle();
    }

    public static void stampTwoRectangles(int a, int b, int c, int d){
        Rectangles rectangle1 = new Rectangles(a, b);
        System.out.println("\n---------- YOUR FIRST RECTANGLE ----------");
        rectangle1.perimeterRectangle();
        rectangle1.areaRectangle();
        System.out.println(" ");

        Rectangles rectangle2 = new Rectangles(a, b);
        System.out.println("---------- YOUR SECOND RECTANGLE ----------");
        rectangle2.perimeterRectangle();
        rectangle2.areaRectangle();
        System.out.println(" ");

        int p1 = (a + b) * 2;
        int p2 = (c + d) * 2;
        int a1 = (a * b);
        int a2 = (a * b);

        System.out.println("------------------- SUM --------------------");
        System.out.println("Sum of perimeters: " + (p1 + p2));
        System.out.println("Sum of areas: " + (a1 + a2));
    }
}
