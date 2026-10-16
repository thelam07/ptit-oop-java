import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();

        ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diem1, diem2, diem3);
        ts.InThongTin();

        sc.close();
    }
}

class ThiSinh {
    String hoTen;
    String ngaySinh;
    double diem1, diem2, diem3;

    ThiSinh(String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    double tongDiem() {
        return diem1 + diem2 + diem3;
    }

    void InThongTin() {
        System.out.printf("%s %s %.1f%n", hoTen, ngaySinh, tongDiem());
    }
}