package kusha.accessModifiers;

public class JavaEmployye {

    private final String firstName;

    private final boolean fullTime;

    public JavaEmployye(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployye(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }
}
