import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
            
        int a = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        int sum = a;
        for(int i = 0; i < n; i++) {
            sum += n;
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}