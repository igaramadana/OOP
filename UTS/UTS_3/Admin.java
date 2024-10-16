package UTS_3;

public class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void updateVehicleDetails(int vehicle_id, String details) {
        FormatOutput.printSuccess("New vehicle added: " + vehicle_id + " details updated: " + details);
    }

    public void addVehicle(String vehicle) {
        FormatOutput.printSuccess("New vehicle added: " + vehicle);
    }

    public void retrieveComplain() {
        FormatOutput.printInfo("Complaint retrieved and under review.");
    }

    public void verifyuser(Customer customer) {
        customer.setVerification(true);
        FormatOutput.printSuccess("User: " + customer.getName() + " has been verified.");
    }
}
