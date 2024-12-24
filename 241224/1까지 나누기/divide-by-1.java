import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int now = 1;
        while(n > 1) {
            n /= now;
            cnt++;
            now++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}