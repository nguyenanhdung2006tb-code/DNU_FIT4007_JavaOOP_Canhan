package part7.methods;

import java.util.Scanner;

public class Example12PrintStringNTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        String s;

        //Nhập N (số lần lặp)
        do {
            System.out.print("Nhập số lần lặp N (số nguyên dương): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại sau nextInt()


        System.out.print("Nhập chuỗi S cần in: ");
        s = scanner.nextLine();

        System.out.println("\n--- Bắt đầu in ---");

        //Gọi phương thức để thực hiện in
        printStringNTimes(N, s);

        System.out.println("--- Kết thúc in ---");

        scanner.close();
    }


    public static void printStringNTimes(int n, String s) {
        //Vòng lặp for chạy n lần
        for (int i = 0; i < n; i++) {
            //In chuỗi s, System.out.println sẽ tự động xuống dòng
            System.out.println(s);
        }
    }
}