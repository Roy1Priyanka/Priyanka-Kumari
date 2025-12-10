import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            result.add(2 * i + 1);
        }

        System.out.println(result);
    }
}
