package part7.methods;

import java.util.Scanner;

public class Example14ConvertDecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Đảm bảo nhập số tự nhiên (nguyên dương)
        do {
            System.out.print("Nhập vào số tự nhiên N để chuyển sang nhị phân (Ví dụ: 7): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N < 0);

        // Gọi phương thức chuyển đổi
        String binaryString = convertToBinary(N);

        System.out.println("\nSố thập phân đã nhập: " + N);
        System.out.println("Chuỗi nhị phân tương ứng là: " + binaryString);

        scanner.close();
    }

    public static String convertToBinary(int N) {
        // Trường hợp đặc biệt: Số 0
        if (N == 0) {
            return "0";
        }

        // StringBuilder giúp việc xây dựng chuỗi hiệu quả hơn so với String nối chuỗi liên tục
        StringBuilder binary = new StringBuilder();
        int tempN = N; // Sử dụng biến tạm để không làm thay đổi tham số gốc

        // Thuật toán: Lặp cho đến khi N bằng 0
        while (tempN > 0) {
            // Lấy phần dư (remainder): Đây là bit nhị phân (0 hoặc 1)
            int remainder = tempN % 2;

            // Thêm bit nhị phân vào ĐẦU chuỗi (vì các bit được tính từ phải sang trái)
            // Thay vì dùng nối chuỗi ("0" + binary), ta dùng insert(0, remainder)
            binary.insert(0, remainder);

            // Cập nhật N: Lấy phần nguyên sau khi chia cho 2
            tempN = tempN / 2;
        }

        return binary.toString();
    }
}