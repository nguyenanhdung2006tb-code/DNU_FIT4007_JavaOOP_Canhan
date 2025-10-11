package part7.methods;

public class Example15CalculateArraySum {

    public static void main(String[] args) {
        // Khai báo một mảng số nguyên
        int[] numbers = {10, 10, 10, 10, 10};

        // In ra các phần tử của mảng để kiểm tra
        System.out.print("Mảng đầu vào: {");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("}");

        // Gọi phương thức tính tổng và lưu trữ kết quả
        long totalSum = calculateArraySum(numbers);

        System.out.println("Tổng của các phần tử trong mảng là: " + totalSum);
    }


    public static long calculateArraySum(int[] arr) {
        // Sử dụng long cho biến tích lũy tổng để đề phòng trường hợp tổng vượt quá giới hạn int
        long sum = 0;

        // Duyệt qua mảng bằng vòng lặp for-each
        for (int element : arr) {
            sum += element; // Tương đương: sum = sum + element;
        }

        return sum;
    }
}