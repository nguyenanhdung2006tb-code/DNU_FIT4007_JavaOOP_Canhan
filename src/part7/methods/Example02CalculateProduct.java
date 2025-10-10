package part7.methods;

import java.util.Scanner;

public class Example02CalculateProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 6;
        int c = 9;
        // gọi phương thức và gán nó vào biến result để in ra kết quả
      int result = calculateProduct(a, b, c);
      System.out.println("Tích của ba số nguyên đã cho trước " + a + "," + b + " và " + c + " là: "  + result );
    }

    public static int calculateProduct(int a, int b, int c){
        return a*b*c;
    }
}
