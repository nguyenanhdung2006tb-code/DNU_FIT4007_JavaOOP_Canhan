package part6.strings;

import java.util.Scanner;

public class Example02CountCharA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        // Gọi phương thức đếm ký tự 'a'
        int count = countCharA(inputString);

        System.out.println("Chuỗi gốc: " + inputString);
        System.out.println("Số lần ký tự 'a' xuất hiện (phân biệt hoa thường): " + count);

        scanner.close();
    }


    public static int countCharA(String str) {
        int count = 0;

        // Lặp qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {

            // Lấy ký tự tại vị trí i
            char character = str.charAt(i);

            // So sánh với ký tự 'a' (chữ thường)
            if (character == 'a') {
                count++;
            }
        }

        return count;
    }
}