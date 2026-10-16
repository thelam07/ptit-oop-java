import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.maNV = "00001";
        nv.hoTen = sc.nextLine().trim();
        nv.gioiTinh = sc.nextLine().trim();
        nv.ngaySinh = chuanHoa(sc.nextLine());
        nv.diaChi = sc.nextLine().trim();
        nv.maST = sc.nextLine().trim();
        nv.ngayKy = chuanHoa(sc.nextLine());

        nv.InThongTin();

        sc.close();
    }

    static String chuanHoa(String s) {
        String[] p = s.trim().split("/");
        return String.format("%02d/%02d/%s", Integer.parseInt(p[0]), Integer.parseInt(p[1]), p[2]);
    }
}

class NhanVien {
    String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maST, ngayKy;

    NhanVien() {
        this.maNV = "";
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maST = "";
        this.ngayKy = "";
    }

    void InThongTin() {
        System.out.printf("%s %s %s %s %s %s %s%n", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maST, ngayKy);
    }
}