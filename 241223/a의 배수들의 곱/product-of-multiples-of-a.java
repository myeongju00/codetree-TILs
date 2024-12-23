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
        
        int result = 1;


        for(int i = a; i <= b; i += a) {
            result *= i;
        }            
        
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.println(sb);
    }
}