import java.util.Scanner;
public class vidu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a + " lớn hơn " + b);
        }else{
            System.out.println(b + " lớn hơn " + a);

        }
        sc.close();
    }
}
