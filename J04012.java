import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoTen = sc.nextLine().trim();
        long luongCoBan = Long.parseLong(sc.nextLine().trim());
        int ngayCong = Integer.parseInt(sc.nextLine().trim());
        String chucVu = sc.nextLine().trim();

        NhanVien nv = new NhanVien(1, hoTen, luongCoBan, ngayCong, chucVu);
        System.out.println(nv);

        sc.close();
    }
}

class NhanVien {
    private String maNV;
    private String hoTen;
    private long luongCoBan;
    private int ngayCong;
    private String chucVu;

    public NhanVien() {
        this.maNV = "";
        this.hoTen = "";
        this.luongCoBan = 0;
        this.ngayCong = 0;
        this.chucVu = "";
    }

    public NhanVien(int stt, String hoTen, long luongCoBan, int ngayCong, String chucVu) {
        this.maNV = String.format("NV%02d", stt);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public long getLuong() {
        return luongCoBan * ngayCong;
    }

    public long getThuong() {
        if (ngayCong >= 25) {
            return getLuong() * 20 / 100;
        } else if (ngayCong >= 22) {
            return getLuong() * 10 / 100;
        }
        return 0;
    }

    public long getPhuCap() {
        if (chucVu.equals("GD")) {
            return 250000;
        } else if (chucVu.equals("PGD")) {
            return 200000;
        } else if (chucVu.equals("TP")) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public long getThuNhap() {
        return getLuong() + getThuong() + getPhuCap();
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + getLuong() + " " + getThuong() + " " + getPhuCap() + " " + getThuNhap();
    }
}