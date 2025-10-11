package part7.methods;

import java.util.Scanner;

public class Example13CalculateTriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhập độ dài 3 cạnh của tam giác (a, b, c):");

        System.out.print("Cạnh a: ");
        a = scanner.nextDouble();

        System.out.print("Cạnh b: ");
        b = scanner.nextDouble();

        System.out.print("Cạnh c: ");
        c = scanner.nextDouble();

        // Gọi phương thức tính diện tích
        double area = calculateTriangleArea(a, b, c);

        System.out.println("\n3 cạnh đã nhập: a=" + a + ", b=" + b + ", c=" + c);

        if (area > 0) {
            System.out.printf("Diện tích tam giác là: %.2f%n", area);
        } else if (area == -1) {
            System.out.println("Tam giác không hợp lệ. Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        } else if (area == -2) {
            System.out.println("Tam giác không hợp lệ. Các cạnh phải là số dương.");
        }


        scanner.close();
    }


    public static double calculateTriangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return -2.0; // lỗi do cạnh âm hoặc bằng 0
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1.0; // lỗi do không thoả mãn điều kiện tam giác
        }

        // Tính nửa chu vi (semi-perimeter)
        double p = (a + b + c) / 2.0;

        // Áp dụng Công thức Heron: Area = sqrt(p * (p-a) * (p-b) * (p-c))
        double areaSquared = p * (p - a) * (p - b) * (p - c);

        // Sử dụng Math.sqrt() để tính căn bậc hai
        double area = Math.sqrt(areaSquared);

        return area;
    }
}
