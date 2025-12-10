import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) a -= 1;  

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < (a + 1) / 2; i++) {
            result.add(2 * i + 1);
        }

        System.out.println(result);
    }
}
