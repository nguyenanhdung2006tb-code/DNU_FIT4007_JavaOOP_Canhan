package part7.methods;

import java.util.Scanner;

public class Example01CalculateSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int result = calculateSum(a, b);

        System.out.println("Tổng của hai số nguyên " + a + " và " + b + " là " + result);
        sc.close();
    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
