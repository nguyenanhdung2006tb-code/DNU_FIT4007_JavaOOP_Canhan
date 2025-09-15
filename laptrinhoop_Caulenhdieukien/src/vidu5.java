import java.util.Scanner;
public class vidu5 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Nhập vào một số: ");
        int n = sc.nextInt();

        if(n>=0 && n<=10){
            System.out.println( n + " là điểm số hợp lí");
        }else{
            System.out.println( n + " không phải điểm số hợp lí");
        }

        sc.close();
    }
}
