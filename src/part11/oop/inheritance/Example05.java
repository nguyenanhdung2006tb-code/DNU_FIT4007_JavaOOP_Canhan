package part11.oop.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add User\n1.1 Add Customer\n1.2 Add Admin\n2. Print Users\n3. Sort Admins above Customers\n4. Login\n0. Exit");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1:
                    System.out.println("Choose type: 1 for Customer, 2 for Admin");
                    int type = Integer.parseInt(sc.nextLine());
                    if(type == 1) {
                        Customer c = new Customer();
                        c.input();
                        users.add(c);
                    } else {
                        Admin a = new Admin();
                        a.input();
                        users.add(a);
                    }
                    break;
                case 2:
                    for(User u : users) System.out.println(u);
                    break;
                case 3:
                    users.sort((u1,u2) -> {
                        if(u1 instanceof Admin && u2 instanceof Customer) return -1;
                        if(u1 instanceof Customer && u2 instanceof Admin) return 1;
                        return 0;
                    });
                    System.out.println("Sorted!");
                    break;
                case 4:
                    System.out.print("Username: "); String uname = sc.nextLine();
                    System.out.print("Password: "); String pwd = sc.nextLine();
                    boolean found = false;
                    for(User u : users) {
                        if(u.getUsername().equals(uname) && u.getPassword().equals(pwd)) {
                            System.out.println("Logged in: " + u);
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Invalid login");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
