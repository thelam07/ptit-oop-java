import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange r = new Rectange(width, height, color);
            color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
            System.out.printf("%.0f %.0f %s", r.findPerimeter(), r.findArea(), color);
        }

        sc.close();
    }
}

class Rectange {
    private double width;
    private double height;
    private static String color;

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectange.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectange.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return height * 2 + width * 2;
    }
}