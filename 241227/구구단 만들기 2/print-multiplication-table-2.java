import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[] multipliers = {2, 4, 6, 8};
        StringBuilder sb = new StringBuilder();

        for (int multiplier : multipliers) {
            for (int i = b; i >= a; i--) {
                sb.append(i).append(" * ").append(multiplier).append(" = ").append(i * multiplier);
                if (i > a) {
                    sb.append(" / ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}