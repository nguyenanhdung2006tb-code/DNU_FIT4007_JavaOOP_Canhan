package part5.arrays;

import java.util.Scanner;

public class Example01PrintArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // theo đề bài: mảng có 5 số nguyên
        int[] arr = new int[n];

        System.out.println("Nhập 5 số nguyên (cách nhau bằng dấu cách hoặc Enter):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // In mảng trên 1 dòng, giữa 2 phần tử 1 dấu cách
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
