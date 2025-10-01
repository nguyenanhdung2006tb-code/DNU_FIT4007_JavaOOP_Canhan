package part5.arrays;

import java.util.Scanner;

public class Example10PrintDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập vào số nguyên dương N (kích thước mảng)
        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        // Kiểm tra N
        if (n <= 0) {
            System.out.println("Mảng phải có ít nhất một phần tử. Kết thúc chương trình.");
            sc.close();
            return;
        }

        // Khởi tạo mảng có kích thước N
        int[] a = new int[n];

        // Biến đếm: dùng để kiểm tra xem có phần tử nào chia hết cho 5 hay không
        int countDivisibleBy5 = 0;

        // 2. Nhập N phần tử của mảng a
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. Duyệt mảng, kiểm tra và in ra
        System.out.print("Các số chia hết cho 5 trong mảng là: ");
        for (int i = 0; i < n; i++) {
            // Điều kiện: Phần tử chia hết cho 5 (phần dư bằng 0)
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " "); // In ra phần tử
                countDivisibleBy5++;          // Tăng biến đếm
            }
        }
        System.out.println(); // Xuống dòng sau khi in các số tìm được

        // 4. Kiểm tra điều kiện "Không tồn tại"
        if (countDivisibleBy5 == 0) {
            System.out.println("Không tồn tại phần tử nào chia hết cho 5");
        }

        sc.close();
    }
}