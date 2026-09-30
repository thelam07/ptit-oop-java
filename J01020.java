import java.util.Scanner;

public class J01020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            long n = sc.nextLong();

            boolean[] daGap = new boolean[10];
            int daCo = 0;
            long i = 1;
            long ketQua = -1;

            while (daCo < 10 && i <= 1000) {
                long k = n * i;
                String s = String.valueOf(k);

                for (int j = 0; j < s.length(); j++) {
                    int d = s.charAt(j) - '0';

                    if (!daGap[d]) {
                        daGap[d] = true;
                        daCo = daCo + 1;
                    }
                }
                if (daCo == 10) {
                    ketQua = k;
                }
                i = i + 1;
            }
            if (ketQua == -1) {
                System.out.println("Impossible");
            } else {
                System.out.println(ketQua);
            }
        }

        sc.close();
    }
}