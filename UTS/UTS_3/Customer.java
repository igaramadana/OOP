package UTS_3;

public class Customer extends User {
    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    private boolean verification_status = false;

    public boolean getVerificationStatus() {
        return verification_status;
    }

    public void applyVerification(String doc) {
        if (doc.toLowerCase().endsWith(".jpg") || doc.toLowerCase().endsWith(".png")
                || doc.toLowerCase().endsWith(".pdf")) {
            FormatOutput.printInfo("Verification applied with document: " + doc);
        } else {
            FormatOutput.printError("Please provide a valid document for verification.");
        }
    }

    public void setVerification(boolean status) {
        this.verification_status = status;
    }
}