package part3.switch_cases;


import java.util.Scanner;
public class vidu3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nhập vào một kí tự trong NEWS: ");
        char k =  sc.next().charAt(0);

        switch (k) {
            case 'N':
                System.out.println("Đây là hướng bắc");
                break;
            case 'S':
                System.out.println("Đây là hướng nam");
                break;
            case 'W':
                System.out.println("Đây là hướng đông");
                break;
            case 'E':
                System.out.println("Đây là hướng tây");
                break;
            default:
                System.out.println("Nhập không hợp lệ !, nếu nhập phải nhập in hoa");
        }
        sc.close();
    }
}
