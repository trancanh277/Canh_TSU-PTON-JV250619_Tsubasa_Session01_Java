import java.util.Scanner;
public class baitap06 {
    public static void main(String[] args) {
        float area;
        float circumference;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chiều rộng");
        float width = sc.nextFloat();
        System.out.println("Mời nhập vào chiều cao");
        float height = sc.nextFloat();
        area = width * height;
        circumference = 2 * (width + height);
        System.out.printf("Diện tích hình chữ nhật là: %f%n Chu vi hình chữ nhật là: %f", area, circumference );
    }
}
