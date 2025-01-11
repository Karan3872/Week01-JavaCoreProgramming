import java.util.Scanner; // Import Scanner class to read user input

// Create a class 'Friends' to find the youngest and tallest friend among three friends
class Friends {

    public static void main(String[] args) {

        // Create a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter names, ages, and heights of three friends
        System.out.print("Enter the name of the first friend: ");
        String friend1 = sc.nextLine();
        System.out.print("Enter " + friend1 + "'s age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter " + friend1 + "'s height: ");
        double height1 = sc.nextDouble();
        
        // Clear the scanner buffer
        sc.nextLine();
        
        System.out.print("Enter the name of the second friend: ");
        String friend2 = sc.nextLine();
        System.out.print("Enter " + friend2 + "'s age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter " + friend2 + "'s height: ");
        double height2 = sc.nextDouble();
        
        // Clear the scanner buffer
        sc.nextLine();
        
        System.out.print("Enter the name of the third friend: ");
        String friend3 = sc.nextLine();
        System.out.print("Enter " + friend3 + "'s age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter " + friend3 + "'s height: ");
        double height3 = sc.nextDouble();
        
        // Find the youngest friend by comparing ages
        int youngestAge = age1;
        String youngestFriend = friend1;
        if (age2 < youngestAge) {
            youngestAge = age2;
            youngestFriend = friend2;
        }
        if (age3 < youngestAge) {
            youngestAge = age3;
            youngestFriend = friend3;
        }

        // Find the tallest friend by comparing heights
        double tallestHeight = height1;
        String tallestFriend = friend1;
        if (height2 > tallestHeight) {
            tallestHeight = height2;
            tallestFriend = friend2;
        }
        if (height3 > tallestHeight) {
            tallestHeight = height3;
            tallestFriend = friend3;
        }

        // Display the youngest and tallest friend
        System.out.println(youngestFriend + " is the youngest.");
        System.out.println(tallestFriend + " is the tallest.");
    }
}