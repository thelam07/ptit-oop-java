import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 2000000;
        int[] uocNTNhoNhat = new int[M + 1];

        for (int p = 2; p <= M; p++) {
            if (uocNTNhoNhat[p] == 0) {
                for (int m = p; m <= M; m = m + p) {
                    if (uocNTNhoNhat[m] == 0) {
                        uocNTNhoNhat[m] = p;
                    }
                }
            }
        }
        int soLuong = sc.nextInt();
        long ketQua = 0;

        for (int i = 0; i < soLuong; i++) {
            int x = sc.nextInt();

            while (x > 1) {
                int uoc = uocNTNhoNhat[x];
                ketQua = ketQua + uoc;
                x = x / uoc;
            }
        }
        System.out.println(ketQua);
        sc.close();
    }
}
