import java.util.Scanner;

public class vidu10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập một ký tự thường (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0);


        char ketQua = (char) (ch + 1);


        System.out.println("Ký tự liền sau '" + ch + "' là: " + ketQua);

        sc.close();
    }
}
