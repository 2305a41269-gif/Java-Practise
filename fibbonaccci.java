import java.util.Scanner;

public class fibbonaccci {
    public static int Series(int n) {
    if (n == 1) {
        return 0;
    } 
    else if (n == 2) {
        return 1;
    } 
    else if (n == 3) {
        return 1;
    } 
    else {
        return Series(n - 1) + Series(n - 2);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position " + n + " = " + Series(n));
    }
}


    