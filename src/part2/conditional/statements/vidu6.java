package part2.conditional.statements;


import java.util.Scanner;
public class vidu6 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
                int a = sc.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
                int b = sc.nextInt();
        System.out.print("Nhập vào số nguyên c: ");
                int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a  ){
            System.out.println("ba số " + a + ", " + b + ", " + c +
                    " là độ dài của 3 cạnh trong cùng một tam giác " );
        }else{
            System.out.println("ba số " + a + ", " + b + ", " + c +
                    " không là độ dài của 3 cạnh trong cùng một tam giác ");
        }
        sc.close();
    }
}
