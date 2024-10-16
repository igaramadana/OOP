package UTS_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        FormatOutput.printHeader("User Management");

        // Create User
        FormatOutput.printSubHeader("User Creation");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter document type (jpg/png/pdf): ");
        String doc = scanner.nextLine();

        UserProfile userProfile = new UserProfile(userId, password, name, age, email, doc);
        User user = new User(userId, password, name, age, email, doc);
        Customer customer = new Customer(userId, password, name, age, email, doc);
        Admin admin = new Admin(666, "admin123", "Administrator", 20, "admin@example.com", "png");
        FormatOutput.printSuccess("User Created Successfully.");

        // User Login
        FormatOutput.printSubHeader("User Login");
        System.out.print("Enter user ID to login: ");
        int loginId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter password to login: ");
        String loginPassword = scanner.nextLine();
        user.login(loginId, loginPassword);
        user.logout();

        // Password Recovery
        FormatOutput.printSubHeader("Password Recovery");
        user.recoverPassword();

        // Customer Verification Process
        FormatOutput.printSubHeader("Customer Verification Process");
        System.out.print("Enter document name for verification: ");
        String verificationDoc = scanner.nextLine();
        customer.applyVerification(verificationDoc);
        FormatOutput.printInfo("Customer verification status: " + customer.getVerificationStatus());

        // Admin Verification Process
        FormatOutput.printSubHeader("Admin Verification Process");
        admin.verifyuser(customer);
        FormatOutput.printInfo(
                "Customer verification status after admin verification: " + customer.getVerificationStatus());

        // User Profile Management
        FormatOutput.printSubHeader("User Profile Management");
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();
        userProfile.editProfile(newName, newAge, newEmail);
        userProfile.showDocuments();

        // Vehicle Management
        FormatOutput.printSubHeader("Vehicle Management");
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter vehicle details: ");
        String vehicleDetails = scanner.nextLine();
        admin.updateVehicleDetails(vehicleId, vehicleDetails);

        FormatOutput.printHeader("End Program");

        scanner.close();
    }
}