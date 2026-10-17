import java.util.Scanner;

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int soTest = sc.nextInt();
            for (int t = 0; t < soTest; t++) {
                Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
                Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
                Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

                double dt = (p2.getX() - p1.getX()) * (p3.getY() - p1.getY())
                        - (p3.getX() - p1.getX()) * (p2.getY() - p1.getY());

                if (Math.abs(dt) < 1e-9) {
                    System.out.println("INVALID");
                } else {
                    double a = p1.distance(p2);
                    double b = p2.distance(p3);
                    double c = p3.distance(p1);

                    double s = 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b));
                    System.out.printf("%.2f\n", s);
                }
            }
        }
        sc.close();
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}