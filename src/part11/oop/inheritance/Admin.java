package part11.oop.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    private ArrayList<String> permissions;

    public Admin() {
        permissions = new ArrayList<>();
    }

    public Admin(String userId, String username, String password, String email, ArrayList<String> permissions) {
        super(userId, username, password, email);
        this.permissions = permissions;
    }

    public ArrayList<String> getPermissions() { return permissions; }
    public void setPermissions(ArrayList<String> permissions) { this.permissions = permissions; }

    @Override
    public void input() {
        super.input();
        permissions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter permissions (comma separated): ");
        String line = sc.nextLine();
        for(String perm : line.split(",")) {
            permissions.add(perm.trim());
        }
    }

    @Override
    public String toString() {
        return "Admin: " + super.toString() + ", permissions=" + permissions;
    }
}
