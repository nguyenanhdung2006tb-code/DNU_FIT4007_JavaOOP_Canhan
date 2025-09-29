package part1.basic.variables;


import java.util.Scanner;
public class vidu4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh 1 của tam giác: ");
        Double a = sc.nextDouble();

        System.out.print("Nhập cạnh 2 của tam giác: ");
        Double b = sc.nextDouble();

        System.out.print("Nhập cạnh 3 của tam giác: ");
        Double c = sc.nextDouble();



        Double chuVi = a + b + c;
        Double nuaChuVi = chuVi/2;
        Double dienTich = Math.sqrt(nuaChuVi*(nuaChuVi - a)*(nuaChuVi - b)*(nuaChuVi - c));

        System.out.println("Chu vi hình tam giác: " + chuVi);
        System.out.println("Diện tích hình tam giác: " + dienTich);

        sc.close();
    }
}
