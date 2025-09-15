import java.util.Scanner;
public class vidu9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         System.out.print("Nhập vào một số nguyên dương N: ");
         int N = sc.nextInt();

        double can = Math.sqrt(N);

        if(can == (int)can){
            System.out.println(N + " là số chính phương" );
        }else{
            System.out.println(N+ " không phải là số chính phương");
        }

      sc.close();
    }
}
