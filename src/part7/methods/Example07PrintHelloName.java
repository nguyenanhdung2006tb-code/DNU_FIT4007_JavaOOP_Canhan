package part7.methods;
import java.util.Scanner;

public class Example07PrintHelloName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String yourName = sc.nextLine();
        printHelloName(yourName);
        sc.close();
    }
    public static void printHelloName(String yourName){
     System.out.println("Hello " + yourName);
    }
}
