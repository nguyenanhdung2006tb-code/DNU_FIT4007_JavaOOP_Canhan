import java.util.Scanner;
public class vidu3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Nhập vào số nguyên N: ");
                int N  = sc.nextInt();

        if (N % 2 == 0){
            System.out.println( N + " là số chẵn");
        }else{
            System.out.println( N + " không phải là số chẵn" );
        }
        sc.close();
    }
}
