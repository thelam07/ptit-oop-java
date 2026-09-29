import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int i = 0; i < soTest; i++) {
            long n = sc.nextLong();
            long s = n * (n + 1) / 2;
            System.out.println(s);
        }
        sc.close();
    }
}
