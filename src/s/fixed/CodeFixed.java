package s.fixed;

public class CodeFixed {
    private String username;
    private String password; 

    public CodeFixed(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        if (Validator.validateUsername(username) && Validator.validatePassword(password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        if (Validator.validateUsername(username) && Validator.validatePassword(password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }




}
