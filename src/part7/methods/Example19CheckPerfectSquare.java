package part7.methods;

import java.util.Scanner;

public class Example19CheckPerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Đảm bảo nhập số nguyên dương
        do {
            System.out.print("Nhập vào số nguyên dương N để kiểm tra số chính phương: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        // Gọi phương thức kiểm tra số chính phương
        boolean isPerfectSquare = isPerfectSquare(N);

        System.out.println("\nSố đã nhập: " + N);

        if (isPerfectSquare) {
            System.out.println("-> KẾT QUẢ: " + N + " là số chính phương.");
        } else {
            System.out.println("-> KẾT QUẢ: " + N + " không phải là số chính phương.");
        }

        scanner.close();
    }


    public static boolean isPerfectSquare(int N) {
        // Trường hợp đặc biệt (nếu cho phép N = 0): 0 cũng được coi là số chính phương.
        // Nếu N < 0 thì Math.sqrt(N) sẽ trả về NaN, không phải số chính phương.

        // 1. Tính căn bậc hai của N (trả về kiểu double).
        double sqrtValue = Math.sqrt(N);

        // 2. Kiểm tra xem căn bậc hai có phải là số nguyên hay không.
        //    Ý tưởng: Ép phần nguyên của sqrtValue sang kiểu long, rồi bình phương lại để so sánh với N.
        //    Nếu bằng nhau → N là số chính phương.

        // Lấy phần nguyên của căn bậc hai, dùng kiểu long để tránh tràn số khi N lớn.
        long root = (long) sqrtValue;

        // So sánh bình phương của root với N.
        // Dùng (long)root * root để tránh tràn kiểu int.
        return (root * root == N);
    }

}