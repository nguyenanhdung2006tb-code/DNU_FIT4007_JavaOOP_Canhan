package part6.strings;

import java.util.Scanner;

public class Example06CheckPangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: The quick brown fox jumps over the lazy dog): ");
        String inputString = scanner.nextLine();


        boolean isPangram = isPangram(inputString);

        System.out.println("Chuỗi gốc: \"" + inputString + "\"");
        if (isPangram) {
            System.out.println("Chuỗi này là chuỗi Pangram.");
        } else {
            System.out.println("Chuỗi này không phải là chuỗi Pangram.");
        }

        scanner.close();
    }


    public static boolean isPangram(String str) {
        //Tạo một mảng gồm 26 phần tử kiểu boolean,và gán nó cho biến alphabetTracker
        boolean[] alphabetTracker = new boolean[26];
        // Chuyển toàn bộ chuỗi sang chữ thường để không phân biệt 'A' và 'a'
        String lowerCaseStr = str.toLowerCase();

        // Lặp qua từng ký tự trong chuỗi lowerCaseStr (từ đầu đến cuối)
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            // Lấy ký tự tại vị trí thứ i trong chuỗi
            char character = lowerCaseStr.charAt(i);

            // Kiểm tra xem ký tự đó có phải là chữ cái thường (từ 'a' đến 'z') hay không
            if (character >= 'a' && character <= 'z') {
                // Tính vị trí (chỉ số) của chữ cái trong bảng chữ cái
                // 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25
                int index = character - 'a';

                // Đánh dấu rằng chữ cái này đã xuất hiện trong chuỗi
                alphabetTracker[index] = true;
            }
        }

        // Duyệt qua từng phần tử trong mảng alphabetTracker
        // Mỗi phần tử (isPresent) biểu thị xem một chữ cái nào đó đã xuất hiện hay chưa
        for (boolean isPresent : alphabetTracker) {
            // Nếu phát hiện có phần tử nào vẫn là false
            // (tức là có ít nhất một chữ cái chưa từng xuất hiện trong chuỗi)
            if (!isPresent) {
                // sẽ trả về false
                return false;
            }
        }

        // nếu không có phần tử nào không xuất hiện (tức là false) thì trả về true
        return true;
    }
}