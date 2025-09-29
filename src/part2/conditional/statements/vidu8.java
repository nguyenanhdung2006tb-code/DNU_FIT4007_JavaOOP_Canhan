package part2.conditional.statements;


import java.util.Scanner;
public class vidu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số thực :");
        double n = sc.nextDouble();

        if(n == (int)n){
            System.out.println(n+ " là số nguyên");
        }
        else {
            System.out.println(n+ " không phải là số nguyên");
        }
        sc.close();
    }
}
