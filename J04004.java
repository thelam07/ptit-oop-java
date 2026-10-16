import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        phanSo p = new phanSo(a, b);
        phanSo q = new phanSo(c, d);

        phanSo tong = p.cong(q);

        System.out.println(tong);

        sc.close();
    }
}

class phanSo {
    private long tuSo;
    private long mauSo;

    public phanSo(long tuSo, long mauSo) {
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

    public phanSo cong(phanSo p) {
        long tu = tuSo * p.mauSo + p.tuSo * mauSo;
        long mau = mauSo * p.mauSo;
        phanSo kq = new phanSo(tu, mau);
        kq.rutGon();
        return kq;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
