import java.util.Scanner;
public class vidu13 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nhập vào chuỗi kí tự a: ");
        String a = sc.nextLine();
        System.out.print("Nhập vào chuỗi kí tự b: ");
        String b = sc.nextLine();

        if (a.equals(b)){
            System.out.println("Hai chuỗi giống nhau");
        }else{
            System.out.println("Hai chuỗi khác nhau");
        }
        sc.close();
    }
}
