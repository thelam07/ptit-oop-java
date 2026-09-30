import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            String s = sc.next();
            boolean thoaMan = true;

            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';

                if (Math.abs(a - b) != 1) {
                    thoaMan = false;
                }
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
