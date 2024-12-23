import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
            
        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        int now = b;
        if(now % 2 == 1) {
            now -= 1;
        }
        while(now >= a) {
            sb.append(now).append(" ");
            now -= 2;
        }
        System.out.println(sb);
    }
}