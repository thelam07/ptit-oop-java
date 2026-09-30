import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            String s = sc.next();
            boolean thoaMan = true;
            int tong = 0;

            for (int i = 0; i < s.length(); i++) {
                int a = s.charAt(i) - '0';
                tong = tong + a;
            }
            for (int j = 0; j < s.length() - 1; j++) {
                int a = s.charAt(j) - '0';
                int b = s.charAt(j + 1) - '0';
                if (Math.abs(a - b) != 2) {
                    thoaMan = false;
                }
            }
            if (tong % 10 != 0) {
                thoaMan = false;
            }

            if (thoaMan) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
