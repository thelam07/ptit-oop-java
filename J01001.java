import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();

        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        if (hcn.hopLe()) {
            System.out.println(hcn.tinhChuVi() + " " + hcn.tinhDienTich());
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}

class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public boolean hopLe() {
        if (chieuDai > 0 && chieuRong > 0) {
            return true;
        } else {
            return false;
        }
    }
}
