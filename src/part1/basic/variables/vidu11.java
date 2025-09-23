import java.util.Scanner;

public class vidu11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int c = a;
            a = b;
            b = c;

        System.out.println("Giá trị của a và b sau khi hoán đổi là: a = " + a + " b = " + b);
    }
}
