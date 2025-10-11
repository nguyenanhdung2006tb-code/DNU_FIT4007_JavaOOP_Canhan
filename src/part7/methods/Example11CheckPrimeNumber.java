package part7.methods;

import java.util.Scanner;

public class Example11CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương N để kiểm tra số nguyên tố: ");

        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();

            // Gọi phương thức kiểm tra số nguyên tố
            boolean isPrime = isPrime(N);

            System.out.println("Số đã nhập: " + N);

            if (isPrime) {
                System.out.println(N + " là số nguyên tố.");
            } else {
                System.out.println(N + " không phải là số nguyên tố.");
            }
        } else {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
        }

        scanner.close();
    }


    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false; // Số nguyên tố phải lớn hơn 1 (1, 0, số âm không phải số nguyên tố)
        }

        // Thuật toán tối ưu: Chỉ cần kiểm tra các ước số từ 2 đến căn bậc hai của N.
        // Nếu N có ước số, chắc chắn ước số đó nằm trong khoảng từ 2 đến sqrt(N).
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // Kiểm tra: Nếu N chia hết cho i (N % i == 0), thì i là một ước số khác 1 và N.
            if (N % i == 0) {
                return false; // Trả về false ngay lập tức
            }
        }

        // Nếu vòng lặp kết thúc mà không tìm thấy ước nào, trả về true. N là số nguyên tố.
        return true;
    }
}