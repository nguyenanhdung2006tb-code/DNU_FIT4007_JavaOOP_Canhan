package part6.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example09CountCharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: Hello World): ");
        String inputString = scanner.nextLine();

        // Gọi phương thức xử lý và in kết quả
        countAndPrintFrequency(inputString);

        scanner.close();
    }

    public static void countAndPrintFrequency(String str) {
        // 1. Khai báo HashMap: Key là ký tự (Character), Value là số lần đếm (Integer)
        Map<Character, Integer> charFrequency = new HashMap<>();

        // 2. Lặp qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            // Bỏ qua khoảng trắng
            if (Character.isWhitespace(character)) {
                continue;
            }

            // Cập nhật tần suất trong Map:
            // Phương thức getOrDefault: Lấy giá trị hiện tại của ký tự đó (nếu có).
            // Nếu chưa có (null), lấy giá trị mặc định là 0, sau đó cộng 1.
            int count = charFrequency.getOrDefault(character, 0);
            charFrequency.put(character, count + 1);
        }

        // 4. In ra kết quả
        System.out.println("\nKết quả tần suất ký tự:");

        // Lặp qua Map.Entry (cặp Key-Value) để in ra kết quả
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}