import java.util.Scanner;
public class vidu2 {
    public static void main(String[] args) {
       Scanner sc = new  Scanner(System.in);

       System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
       int a = sc.nextInt();
       System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
       int b = sc.nextInt();

       if(a == b){
           System.out.println("Hình chữ nhật này là hình vuông");
       }else {
           System.out.println("Hình chữ nhật này không phải hình vuông");
       }

       sc.close();
    }
}
