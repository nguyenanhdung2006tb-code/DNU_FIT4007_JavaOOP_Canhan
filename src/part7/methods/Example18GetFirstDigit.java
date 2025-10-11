package part7.methods;

import java.util.Scanner;

public class Example18GetFirstDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Đảm bảo nhập số tự nhiên (nguyên dương)
        do {
            System.out.print("Nhập vào số tự nhiên N để tìm chữ số đầu tiên (Ví dụ: 123): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N < 0);

        // Gọi phương thức tìm chữ số đầu tiên
        int firstDigit = getFirstDigit(N);

        System.out.println("\nSố đã nhập: " + N);
        System.out.println("-> KẾT QUẢ: Chữ số đầu tiên là: " + firstDigit);

        scanner.close();
    }


    public static int getFirstDigit(int number) {
        // Trường hợp đặc biệt: nếu số là 0 thì chữ số đầu tiên là 0.
        if (number == 0) {
            return 0;
        }

        // Dùng giá trị tuyệt đối để xử lý số âm (giúp code linh hoạt hơn).
        int tempNumber = Math.abs(number);

        // Chia liên tục cho 10 cho đến khi chỉ còn 1 chữ số.
        while (tempNumber >= 10) {
            tempNumber /= 10; // loại bỏ chữ số cuối cùng
            // Ví dụ: 123 -> 12 -> 1
        }

        // Giá trị còn lại chính là chữ số đầu tiên.
        return tempNumber;
    }

}