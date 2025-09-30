package part5.arrays;

import java.util.Scanner;

public class Example11FindLastMaxIndex {
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

        // 2. Nhập N phần tử của mảng a
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. Khởi tạo giá trị Max và chỉ số của nó
        int max = a[0];
        int maxIndex = 0; // Giả định Max ban đầu là phần tử đầu tiên (chỉ số 0)

        // 4. Duyệt mảng từ chỉ số 1 trở đi
        for (int i = 1; i < n; i++) {
            // Điều kiện quan trọng: Lấy chỉ số cuối cùng
            // Ta dùng điều kiện 'a[i] >= max' (Lớn hơn hoặc bằng)
            // Nếu tìm thấy giá trị BẰNG giá trị Max hiện tại, ta vẫn cập nhật chỉ số,
            // đảm bảo chỉ số được lưu luôn là chỉ số cuối cùng tìm thấy.
            if (a[i] >= max) {
                max = a[i];       // Cập nhật giá trị Max
                maxIndex = i;     // Cập nhật chỉ số (chỉ số cuối cùng)
            }
        }

        // 5. In ra kết quả
        System.out.println("Giá trị lớn nhất (Max) trong mảng là: " + max);
        System.out.println("Chỉ số của phần tử lớn nhất cuối cùng là: " + maxIndex);

        sc.close();
    }
}