import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long tong = 0;
        long tam = 1;

        for (int i = 1; i <= n; i++) {
            tam = tam * i;
            tong = tong + tam;
        }
        System.out.print(tong);

        sc.close();
    }
}
