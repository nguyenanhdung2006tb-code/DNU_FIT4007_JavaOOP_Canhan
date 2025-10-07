package part6.strings;

import java.util.Scanner;

public class Example03CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: racecar hoặc madam): ");
        String inputString = scanner.nextLine();

        // Gọi phương thức kiểm tra và in ra kết quả
        boolean isPalindrome = isPalindrome(inputString);

        System.out.println("Chuỗi gốc: " + inputString);
        if (isPalindrome) {
            System.out.println(" Chuỗi này là chuỗi đối xứng (Palindrome).");
        } else {
            System.out.println(" Chuỗi này KHÔNG phải là chuỗi đối xứng.");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String str) {
        // 1. Khai báo hai con trỏ:
        // leftIndex: bắt đầu từ ký tự đầu tiên (chỉ số 0)
        // rightIndex: bắt đầu từ ký tự cuối cùng (chỉ số length - 1)
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        // 2. Lặp cho đến khi hai con trỏ gặp nhau hoặc vượt qua nhau
        while (leftIndex < rightIndex) {

            // 3. Lấy ký tự tại hai vị trí
            char leftChar = str.charAt(leftIndex);
            char rightChar = str.charAt(rightIndex);

            // 4. So sánh ký tự:
            if (leftChar != rightChar) {
                // Nếu hai ký tự khác nhau, chuỗi KHÔNG phải là đối xứng
                return false;
            }

            // 5. Nếu giống nhau, di chuyển các con trỏ vào giữa
            leftIndex++;
            rightIndex--;
        }

        // 6. Nếu vòng lặp kết thúc mà không trả về false, thì sẽ trả về true => chuỗi là đối xứng
        return true;
    }
}