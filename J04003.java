import java.util.Scanner;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        PhanSo p = new PhanSo(tuSo, mauSo);
        p.rutGon();
        System.out.println(p);

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

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
