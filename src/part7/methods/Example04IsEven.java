package part7.methods;
import java.util.Scanner;
public class Example04IsEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        if(sc.hasNextInt()) {
            int N = sc.nextInt();

            boolean result = isEven(N);

            if (result) {
                System.out.println("Đây là số chẵn");
            } else {
                System.out.println("Đây là số lẻ");
            }
        }else{
            System.out.println("không được nhập chữ!, vui lòng nhập số");
        }
        sc.close();
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
