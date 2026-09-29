import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            String s = sc.next();
            String kq = "";
            boolean hopLe = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '0' || c == '8' || c == '9') {
                    kq = kq + "0";
                } else if (c == '1') {
                    kq = kq + "1";
                } else {
                    hopLe = false;
                }
            }
            int vt = kq.indexOf('1');
            if (!hopLe || vt == -1) {
                System.out.println("INVALID");
            } else {
                System.out.println(kq.substring(vt));
            }
        }
        sc.close();
    }
}
