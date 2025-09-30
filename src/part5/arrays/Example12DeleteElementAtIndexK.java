package part5.arrays;

import java.util.Scanner;

public class Example12DeleteElementAtIndexK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập N và Mảng A
        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mảng phải có ít nhất một phần tử. Kết thúc chương trình.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 2. Nhập chỉ số K cần xóa
        System.out.print("Nhập chỉ số k cần xóa (0 <= k < N): ");
        int k = sc.nextInt();

        // Kiểm tra điều kiện 0 <= k < N
        if (k < 0 || k >= n) {
            System.out.println("Chỉ số k không hợp lệ. Kết thúc chương trình.");
            sc.close();
            return;
        }

        // 3. thuật toán xóa (dịch chuyển)

        // Duyệt mảng từ chỉ số k đến gần cuối (n-1)
        // Bắt đầu từ vị trí cần xóa (i=k) và dừng lại trước phần tử cuối cùng
        for (int i = k; i < n - 1; i++) {
            // Gán giá trị của phần tử phía sau (i+1) cho phần tử hiện tại (i)
            // Ví dụ: a[k] = a[k+1], a[k+1] = a[k+2], ...
            a[i] = a[i + 1];
        }

        // 4. In ra Mảng Mới (với N-1 phần tử)
        System.out.println("Mảng sau khi xoá phần tử tại chỉ số " + k + " là:");

        // Vòng lặp chỉ in ra N-1 phần tử (từ 0 đến n-2)
        // Phần tử cuối cùng (a[n-1]) vẫn còn giá trị cũ nhưng không được in ra.
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}