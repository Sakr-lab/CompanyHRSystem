import java.util.*;

public class CompanyHRSystem {
    public static void main(String[] args) {
        HR hrAdmin = new HR("Carol", 4000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- HR Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // تنظيف buffer

            switch (choice) {
                case 1:
                    hrAdmin.addEmployeeFromInput(sc);
                    break;
                case 2:
                    hrAdmin.showAllEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; // الخروج من البرنامج
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}