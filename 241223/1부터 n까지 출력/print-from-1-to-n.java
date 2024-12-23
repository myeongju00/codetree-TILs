import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
            
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(i + 1).append(" ");
        }

        System.out.println(sb);
    }
}