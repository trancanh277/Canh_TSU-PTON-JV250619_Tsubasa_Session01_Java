import java.util.Scanner;
public class baitap05 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số 1");
        int a = sc.nextInt();
        System.out.println("Nhập mẫu số 1");
        int b = sc.nextInt();
        System.out.println("Nhập tử số 2");
        int c = sc.nextInt();
        System.out.println("Nhập mẫu số 2");
        int d = sc.nextInt();
        int tu = a * d + b * c;
        int mau = b * d;
        int ucln = gcd(tu, mau);
        tu /= ucln;
        mau /= ucln;
        System.out.printf("Kết quả: " + tu + "/" + mau);

    }
}
