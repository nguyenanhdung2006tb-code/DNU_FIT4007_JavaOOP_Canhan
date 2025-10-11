package part7.methods;

import java.util.Scanner;

public class Example17GetLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên (có thể là số âm): ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Gọi phương thức tìm chữ số cuối cùng
            int lastDigit = getLastDigit(number);

            System.out.println("\nSố đã nhập: " + number);
            System.out.println("-> KẾT QUẢ: Chữ số cuối cùng là: " + lastDigit);

        } else {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
        }

        scanner.close();
    }

    public static int getLastDigit(int number) {
        // Lấy chữ số cuối cùng của một số nguyên bằng phép chia lấy dư cho 10.
        // Trong Java, kết quả của phép chia dư có thể âm nếu số ban đầu âm (ví dụ: -123 % 10 = -3),
        // nên cần dùng Math.abs() để đảm bảo kết quả là chữ số dương (0–9).

        int lastDigit = number % 10;
        return Math.abs(lastDigit);
    }

}