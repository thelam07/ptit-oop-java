import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        sc.nextLine();
        for (int t = 0; t < soTest; t++) {
            String s = sc.nextLine();

            String tam = s.trim();
            String[] tu = tam.split("\\s+");
            String ketqua = "";

            for (int i = 0; i < tu.length; i++) {
                String chuan = tu[i].substring(0, 1).toUpperCase() + tu[i].substring(1).toLowerCase();
                ketqua = ketqua + chuan;
                if (i < tu.length - 1) {
                    ketqua = ketqua + " ";
                }
            }
            System.out.println(ketqua);
        }
        sc.close();
    }

}
