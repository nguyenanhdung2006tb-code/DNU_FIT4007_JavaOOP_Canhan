package part7.methods;

import java.util.Scanner;

public class Example20CountTrailingZeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Đảm bảo nhập số nguyên không âm
        do {
            System.out.print("Nhập vào số nguyên không âm N để tính số lượng chữ số 0 cuối cùng của N!: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N < 0);

        // Gọi phương thức tính số lượng chữ số 0
        int zeros = countTrailingZeros(N);

        System.out.println("\nSố đã nhập N: " + N);
        System.out.println("-> KẾT QUẢ: Số lượng chữ số 0 tận cùng của " + N + "! là: " + zeros);

        scanner.close();
    }


    public static int countTrailingZeros(int N) {
        // Với N < 5: các giai thừa từ 0! đến 4! đều không có chữ số 0 tận cùng.
        if (N < 5) {
            return 0;
        }

        int count = 0;
        int powerOf5 = 5; // Bắt đầu với 5^1

        // Mỗi bội của 5 trong N! tạo ra ít nhất một chữ số 0 tận cùng.
        // Ngoài ra, các bội của 25, 125,... tạo thêm chữ số 0 vì chứa nhiều thừa số 5.
        while (N / powerOf5 >= 1) {
            // Cộng số lượng bội số của 5^k vào tổng
            count += N / powerOf5;

            // Tăng lũy thừa của 5 cho lần lặp tiếp theo (5 → 25 → 125 → …)
            powerOf5 *= 5;
            // Với kiểu int, 5^13 > Integer.MAX_VALUE, nên vòng lặp sẽ dừng trước khi tràn số.
        }

        return count;
    }

}