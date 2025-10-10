package part7.methods;

import java.util.Scanner;

public class Example03IsNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            boolean isNatural = isNaturalNumber(N);

            if (isNatural) {
                System.out.println(N + " là số tự nhiên");
            } else {
                System.out.println(N + " không phải số tự nhiên");
            }
        }else{
            System.out.println("Không được nhập chữ!, vui lòng nhập số nguyên hợp lệ");
        }
        sc.close();
    }
    public static boolean isNaturalNumber(int N){
        return N >= 0;
    }
}
