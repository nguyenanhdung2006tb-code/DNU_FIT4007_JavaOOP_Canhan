package part3.switch_cases;


import java.util.Scanner;
public class vidu4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

         System.out.print("Nhập số nguyên a: ");
         int a = sc.nextInt();
         System.out.print("Nhập số nguyên b (Không nhập 0 khi thực hiện phép chia): ");
         int b = sc.nextInt();
         System.out.print("Nhập tiếp một phép tính (+,-,*,/,%): ");
         char op = sc.next().charAt(0);

         int ketqua = 0;

         switch(op){
             case '+':
                 ketqua = a + b;
                 System.out.println(a + "+" + b + " = " + ketqua);
                 break;
             case  '-':
                 ketqua = a - b;
                 System.out.println(a + " - " + b + " = " + ketqua);
                 break;
             case  '*':
                 ketqua = a * b;
                 System.out.println(a + " * " + b + " = " + ketqua);
                 break;
             case   '/':
                 ketqua = a / b;
                 System.out.println(a + " / " + b + " = " + ketqua);
                 break;
             case  '%':
                 ketqua = a % b;
                 System.out.println(a + " % " + b + " = " + ketqua);
                 break;
             default:
                 System.out.println("Nhập phép tính không hợp lệ, vui lòng nhập lại: ");
         }
         sc.close();
    }
}
