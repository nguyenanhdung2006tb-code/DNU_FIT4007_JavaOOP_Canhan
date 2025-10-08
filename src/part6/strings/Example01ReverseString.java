package part6.strings;
import java.util.Scanner;
public class Example01ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi (ví dụ: Hello): ");
        String originalString = sc.nextLine();
        // gọi phương thức reverseStringSimple để đảo ngược chuỗi
        String reversedString  = reverseStringSimple(originalString);

        System.out.println("Chuỗi gốc: " + originalString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);

        sc.close();
    }

    public static String reverseStringSimple(String str){
        String reversed = "";
        // lấy độ dài chuỗi đã truyền vào
        int n = str.length();
        // Vòng lặp duyệt từ kí tự n - 1 (ký tự cuối) đến kí tự đầu tiên trong chuỗi
        for(int i = n - 1; i >= 0; i--){
            char character = str.charAt(i);
            reversed = reversed + character;
        }
        return reversed;
    }
}
