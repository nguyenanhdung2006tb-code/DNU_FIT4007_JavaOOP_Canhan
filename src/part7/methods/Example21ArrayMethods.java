package part7.methods;

import java.util.Arrays;

public class Example21ArrayMethods {

    public static void main(String[] args) {
        // Mảng gốc ban đầu
        int[] originalArray = {10, 20, 30, 40, 50};

        System.out.println("1. Phương thức in ra mảng (printArray):");
        System.out.print("Mảng gốc: ");
        printArray(originalArray); // Gọi hàm in mảng

        System.out.println("\n------------------------------------------------");

        System.out.println("2. Phương thức trả về mảng đảo ngược (reverseArray):");

        // Gọi hàm đảo ngược mảng và lưu kết quả vào mảng mới
        int[] reversedArray = reverseArray(originalArray);

        System.out.print("Mảng đảo ngược: ");
        printArray(reversedArray); // In ra mảng đảo ngược
    }

    // -------------------------------------------------------------------------
    // HÀM 1: IN MẢNG
    // -------------------------------------------------------------------------

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Chỉ in dấu phẩy nếu phần tử hiện tại không phải là phần tử cuối cùng
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // Ghi chú: Có thể dùng Arrays.toString(arr) để in nhanh hơn,
        // nhưng ở đây dùng vòng lặp để minh họa thao tác cơ bản.
    }

    // -------------------------------------------------------------------------
    // HÀM 2: TRẢ VỀ MẢNG ĐẢO NGƯỢC
    // -------------------------------------------------------------------------

    public static int[] reverseArray(int[] arr) {
        // 1. Tạo một mảng mới có cùng kích thước để lưu trữ kết quả đảo ngược
        int[] reversedArr = new int[arr.length];
        int n = arr.length;

        // 2. Duyệt qua mảng gốc và gán giá trị vào mảng mới theo thứ tự ngược
        for (int i = 0; i < n; i++) {
            // Ví dụ: phần tử đầu của mảng mới (i=0) = phần tử cuối của mảng gốc (arr[n-1])
            reversedArr[i] = arr[n - 1 - i];
        }

        return reversedArr;
    }
}
