package part2.conditional.statements;


import java.util.Scanner;
public class vidu10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương a: ");
                int a =  sc.nextInt();
        System.out.print("Nhập vào số nguyên dương b: ");
                int b =  sc.nextInt();
        System.out.print("Nhập vào số nguyên dương c: ");
                int c =  sc.nextInt();

        if(b % c == 0 && a % b == 0){
            System.out.print(b+ " đồng thời là ước của " + a + " và là bội của " + c );
        }else{
            System.out.print(b+ " không đồng thời là ước của " + a + " và là bội của " + c );
        }
        sc.close();
    }
}
