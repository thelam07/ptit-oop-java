import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int vtMin = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[vtMin]) {
                    vtMin = j;
                }
            }
            int tam = a[i];
            a[i] = a[vtMin];
            a[vtMin] = tam;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
