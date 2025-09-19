import java.util.Scanner;
public class vidu2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên chỉ giới tính của một người: ");
        int n = sc.nextInt();

        switch (n){
            case 0:
                System.out.println("Là nam");
                break;
            case 1:
                System.out.println("Là nữ");
                break;
            case 2:
                System.out.println("Khác");
                break;
            default:
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại");
        }
        sc.close();
    }
}
