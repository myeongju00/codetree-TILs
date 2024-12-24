import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean found = false;

        for(int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n % 3 != 0) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}