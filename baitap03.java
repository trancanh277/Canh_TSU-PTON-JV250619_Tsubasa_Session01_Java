import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        double bankinh;
        double dientich;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        bankinh = scanner.nextDouble();
        dientich = Math.PI*bankinh*bankinh;
        System.out.printf("Diện tích: %.2f\n", dientich);
        scanner.close();
    }
}
