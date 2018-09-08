import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for (int i = 0; i < length; i++) {
            password += alphabet.charAt(random.nextInt(26));
        }
        return password;
    }
}
