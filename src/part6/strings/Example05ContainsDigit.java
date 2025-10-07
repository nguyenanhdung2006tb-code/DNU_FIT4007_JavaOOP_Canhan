package part6.strings;

import java.util.Scanner;

public class Example05ContainsDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: PTIT_K60 hoặc JavaCourse): ");
        String inputString = scanner.nextLine();

        // Gọi phương thức kiểm tra
        boolean hasDigit = containsDigit(inputString);

        System.out.println("Chuỗi gốc: " + inputString);
        if (hasDigit) {
            System.out.println("-> KẾT QUẢ: Chuỗi chứa ít nhất một ký tự số.");
        } else {
            System.out.println("-> KẾT QUẢ: Chuỗi không chứa bất kỳ ký tự số nào.");
        }

        scanner.close();
    }

    public static boolean containsDigit(String str) {
        // Kiểm tra trường hợp chuỗi rỗng
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Lặp qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {

            // Lấy ký tự tại chỉ số hiện tại
            char character = str.charAt(i);

            // Sử dụng phương thức tiện ích của Java để kiểm tra
            if (Character.isDigit(character)) {
                // Nếu tìm thấy một ký tự số, ta có thể dừng ngay và trả về true
                return true;
            }
        }

        // Nếu vòng lặp kết thúc mà không tìm thấy ký tự số nào
        return false;
    }
}