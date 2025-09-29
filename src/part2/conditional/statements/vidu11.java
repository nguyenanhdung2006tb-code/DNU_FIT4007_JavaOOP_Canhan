package part2.conditional.statements;
import java.util.Scanner;
public class vidu11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một ký tự: ");
        char ch =  sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " là ký tự in thường");
        }else{
            System.out.println(ch + " không phải là ký tự in thường");
        }
        sc.close();
    }
}
