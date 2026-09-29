import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long luuA = a;
            long luuB = b;

            while (b != 0) {
                long tam = a % b;
                a = b;
                b = tam;
            }

            long ucln = a;
            long bscnn = luuA * luuB / ucln;
            System.out.println(bscnn + " " + ucln);
        }
        sc.close();
    }
}
