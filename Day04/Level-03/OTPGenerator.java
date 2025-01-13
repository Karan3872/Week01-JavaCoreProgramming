import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static void main(String[] args) {
        // Generate and store 10 OTP numbers
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate the uniqueness of the OTPs
        boolean isUnique = areOTPsUnique(otps);
        if (isUnique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }
}

