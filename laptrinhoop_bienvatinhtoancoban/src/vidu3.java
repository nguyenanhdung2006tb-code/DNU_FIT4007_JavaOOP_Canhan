import java.util.Scanner;
public class vidu3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double d = sc.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double r = sc.nextDouble();



        double chuVi = 2 * (d + r);
        double dienTich = d * r;


        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);

        sc.close();
    }

}