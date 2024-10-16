import java.util.Scanner;

public class Program3 {
    public static void patternedSeries(int x) {
        for (int i = 1; i <= 2 * x - 1; i += 2) {
            System.out.print(i);
            if (i + 2 <= 2 * x - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        patternedSeries(a);
    }
}
