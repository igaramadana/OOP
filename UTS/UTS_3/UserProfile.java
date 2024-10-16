package UTS_3;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email_id;
    }

    public void editProfile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        FormatOutput.printSuccess("Profile Updated Successfully.");
    }

    public void showDocuments() {
        if (doc != null) {
            FormatOutput.printInfo("Document: " + doc);
        } else {
            FormatOutput.printInfo("No document found.");
        }
    }
}
