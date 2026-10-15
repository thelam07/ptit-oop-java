import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        PhanSo p = new PhanSo(a, b);
        PhanSo q = new PhanSo(c, d);

        PhanSo tong = p.cong(q);

        System.out.println(tong);

        sc.close();
    }
}

class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public void rutGon() {
        long ucln = gcd(tuSo, mauSo);
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;
    }

    public PhanSo cong(PhanSo p) {
        long tu = tuSo * p.mauSo + p.tuSo * mauSo;
        long mau = mauSo * p.mauSo;
        PhanSo kq = new PhanSo(tu, mau);
        kq.rutGon();
        return kq;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
