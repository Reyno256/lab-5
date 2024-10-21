package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private final String name;

    public LogoutInputData(String username) {
        // Done TODO: save the current username in an instance variable and add a getter.
        this.name = username;
    }

    public String getName() {
        return name;
    }
}
