package part1.basic.variables;


import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        if(b!=0){
            double thuong = (double) a/b;
            System.out.println("Thương: " + thuong);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);

        sc.close();
    }
}