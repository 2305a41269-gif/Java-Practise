import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are NOT eligible to vote!");
            return;
        }

        System.out.println("You are eligible to vote!");

        String[] candidates = {"A", "B", "C"};
        int[] votes = {0, 0, 0};

        System.out.println("\nChoose a candidate to vote for:");
        System.out.println("1. Candidate X");
        System.out.println("2. Candidate Y");
        System.out.println("3. Candidate Z");
        System.out.print("Enter choice (1-3): ");

        int choice = sc.nextInt();
        
        if (choice >= 1 && choice <= 3) {
            votes[choice - 1]++;  
            System.out.println("\nVote recorded successfully!");
        } else {
            System.out.println("\nInvalid choice! No vote recorded.");
        }

        // --- Step 6: Show results ---
        System.out.println("\n--- Voting Results ---");
        System.out.println("Candidate A: " + votes[0] + " vote(s)");
        System.out.println("Candidate B: " + votes[1] + " vote(s)");
        System.out.println("Candidate C: " + votes[2] + " vote(s)");

        sc.close();
    }
}

