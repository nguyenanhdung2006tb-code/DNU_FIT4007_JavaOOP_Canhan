package part2.conditional.statements;


import java.util.Scanner;
public class vidu12 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Nhập vào một ký tự: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
           System.out.println(ch + " là kí tự in hoa");
        }else{
            System.out.println(ch + " không phải là kí tự in hoa");
        }
        sc.close();
    }
}
