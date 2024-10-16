import java.util.Scanner;

public class Program2 {

    public static void generateSeries(int x) {
        for (int i = 1; i <= 2 * x; i += 2) { // loop through odd number
            System.out.print(i);
            if (i + 2 <= 2 * x) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        generateSeries(a);
        sc.close();
    }
}
