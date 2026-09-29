import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int j = 0; j < soTest; j++) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i < n; i++) {
                double d = h * Math.sqrt((double) i / n);
                System.out.printf("%.6f ", d);
            }
            System.out.println();
        }
        sc.close();
    }
}
