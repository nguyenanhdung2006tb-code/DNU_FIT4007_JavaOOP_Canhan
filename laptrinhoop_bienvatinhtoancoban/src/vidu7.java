import java.util.Scanner;
public class vidu7 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = sc.nextInt();

        int chuSoGanCuoi = Math.abs((n % 100) / 10);

        System.out.print("Chữ số gần cuối của " + n + " là " + chuSoGanCuoi);

        sc.close();
    }
}
