import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        
        if(a % 6 != 0) {
            a += (a % 6);
        }

        for(int i = a; i <= b; i += 6) {
            if(i % 8 != 0) {
                sum += i;
            }
        }            
        
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}