package part2.conditional.statements;


import java.util.Scanner;
public class vidu15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nhập giờ h (0 <= h < 24): ");
        int h = sc.nextInt();
        System.out.print("Nhập phút m (0 <= m < 60): ");
        int m = sc.nextInt();


        System.out.println("Thời gian hiện tại: " + h + ":" + (m < 10 ? "0" + m : m));

        m++;
        if ( m == 60 ){
            m = 0;
            h++;
            if (h == 24){
                h = 0;
            }
        }

        System.out.println("Thời gian sau 1 phút: " + h + ":" + (m < 10 ? "0" + m : m));

        sc.close();

    }
}
