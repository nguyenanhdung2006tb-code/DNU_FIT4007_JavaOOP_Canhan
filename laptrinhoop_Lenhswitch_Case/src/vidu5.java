import java.util.Scanner;
public class vidu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();
        System.out.print("Nhập tháng(1-12): ");
        int month = sc.nextInt();

        int days = 0;

        switch(month) {
            case 1: case 3: case 5:case 7:case 8:case 10:case 12:
                days = 31;
                break;
            case  4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            default:
                System.out.println("Nhập tháng không hợp lí!");
                sc.close();
                return;
        }
        System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày");
        sc.close();
    }
}
