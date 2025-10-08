package part6.strings;

import java.util.Scanner;

public class Example07ToUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: java for beginners): ");
        String inputString = scanner.nextLine();

        // 1. Gọi phương thức tự định nghĩa để chuyển đổi chuỗi
        String upperCaseString = convertToUpperCase(inputString);

        System.out.println("Chuỗi gốc: " + inputString);
        System.out.println("Chuỗi in hoa: " + upperCaseString);

        scanner.close();
    }


    public static String convertToUpperCase(String str) {
        // Sử dụng phương thức tích hợp sẵn toUpperCase() của lớp String
        //Phương thức này đi qua từng ký tự trong chuỗi gốc. Nếu ký tự đó
        // là chữ cái thường, nó sẽ được chuyển thành chữ cái hoa tương ứng.
        // Các ký tự khác (khoảng trắng, số, dấu câu) sẽ được giữ nguyên.
        return str.toUpperCase();
    }
}