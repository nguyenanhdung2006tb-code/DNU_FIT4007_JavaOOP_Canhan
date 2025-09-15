import java.util.Scanner;
public class vidu7 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0 && a + b + c == 180){
            System.out.println("Ba số " + a + "," + b + "," + c +" là độ lớn 3 góc của một tam giác ");
        }else{
            System.out.println("Ba số " + a + "," + b + "," + c +" không là độ lớn 3 góc của một tam giác ");
        }
        sc.close();
    }
}
