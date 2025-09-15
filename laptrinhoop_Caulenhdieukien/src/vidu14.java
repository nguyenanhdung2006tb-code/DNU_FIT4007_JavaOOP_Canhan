import java.util.Scanner;
public class vidu14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        if (a.length() > b.length()){
           System.out.println("Chuỗi a có độ dài dài hơn");
        }else if (a.length() < b.length()){
            System.out.println("Chuỗi b có độ dài dài hơn");
        }else{
            System.out.println("Hai chuỗi có độ dài bằng nhau, chuỗi a là: " + a);
        }
        sc.close();
    }
}
