import java.util.HashMap;

public class Program4 {
    public static HashMap<Integer, Integer> countMultiples(int[] arr) {
        HashMap<Integer, Integer> result = new HashMap<>();
        
        // Initialize the result map with keys from 1 to 9
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        HashMap<Integer, Integer> multiplesCount = countMultiples(inputArray);

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + multiplesCount.get(i));
        }
    }
}
