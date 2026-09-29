import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        for (int j = 0; j < soTest; j++) {
            int n = sc.nextInt();
            boolean laNguyenTo = true;

            if (n < 2) {
                laNguyenTo = false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                }
            }
            if (laNguyenTo == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
