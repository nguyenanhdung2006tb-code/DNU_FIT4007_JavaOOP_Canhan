import java.util.Scanner;
public class vidu9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b (khác 0): ");
        int b = sc.nextInt();


        double kq = (double) a / b;


        System.out.println(a + " / " + b + " = " + kq);

        sc.close();
    }
}
