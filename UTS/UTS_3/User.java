package UTS_3;

public class User extends UserProfile {
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean login(int user_id, String password) {
        if (this.getUser_id() == user_id && this.getPassword().equals(password)) {
            FormatOutput.printSuccess("Login Successful.");
            FormatOutput.printInfo("Welcome, " + getName());
            return true;
        }
        FormatOutput.printError("Login Failed.");
        return false;
    }

    public void recoverPassword() {
        FormatOutput.printInfo("Password recovery process initiated.");
    }

    public void logout() {
        FormatOutput.printInfo("User logged out.");
    }
}