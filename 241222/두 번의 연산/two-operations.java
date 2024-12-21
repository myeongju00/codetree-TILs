import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());

        if (a % 2 == 1) {
            a += 3;
        }

        if (a % 3 == 0) {
            a /= 3;
        }
        
        System.out.println(a);
    }
}