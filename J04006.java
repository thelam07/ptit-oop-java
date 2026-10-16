import java.util.Scanner;

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv = new SinhVien();
        sv.maSV = "B20DCCN001";
        sv.hoTen = sc.nextLine().trim();
        sv.lop = sc.nextLine().trim();
        sv.ngaySinh = chuanHoa(sc.nextLine());
        sv.gpa = Float.parseFloat(sc.nextLine().trim());

        sv.InThongTin();

        sc.close();
    }

    static String chuanHoa(String s) {
        String[] p = s.trim().split("/");
        return String.format("%02d/%02d/%s", Integer.parseInt(p[0]), Integer.parseInt(p[1]), p[2]);
    }
}

class SinhVien {
    String maSV, hoTen, lop, ngaySinh;
    float gpa;

    SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    void InThongTin() {
        System.out.printf("%s %s %s %s %.2f%n", maSV, hoTen, lop, ngaySinh, gpa);
    }
}