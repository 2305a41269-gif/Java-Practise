import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        String username = name.toLowerCase().replace(" ", ".");

        System.out.println("Username: " + username);
        String noVowels = name.toLowerCase().replaceAll("[AEIOUaeiou]", "");
        System.out.println(noVowels);

    }
}
