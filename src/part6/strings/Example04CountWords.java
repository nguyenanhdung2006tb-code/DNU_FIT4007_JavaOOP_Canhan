package part6.strings;

import java.util.Scanner;

public class Example04CountWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi văn bản: ");
        String inputString = scanner.nextLine();

        // Gọi phương thức đếm từ
        int wordCount = countWords(inputString);

        System.out.println("Chuỗi gốc: \"" + inputString + "\"");
        System.out.println("Số từ trong chuỗi là: " + wordCount);

        scanner.close();
    }


    public static int countWords(String str) {
        // Kiểm tra trường hợp chuỗi rỗng hoặc chỉ có khoảng trắng
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi (sử dụng trim())
        String trimmedString = str.trim();

        // Tách chuỗi thành mảng các từ.
        // \\s+ là biểu thức chính quy (regex) có nghĩa là "một hoặc nhiều khoảng trắng".
        // Tuy nhiên, theo yêu cầu bài toán (chỉ 1 khoảng trắng), ta chỉ cần dùng " "

        //split() trả về một mảng các chuỗi, nên ta cần một biến kiểu String[] để lưu.
        String[] words = trimmedString.split(" ");


        return words.length;
    }
}