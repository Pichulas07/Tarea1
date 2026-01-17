package s.fixed;

public class Main {
    public static void main(String[] args) {
        CodeFixed userManager = new CodeFixed("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();
    }
}
