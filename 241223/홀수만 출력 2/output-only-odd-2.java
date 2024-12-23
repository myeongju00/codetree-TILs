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
        
        if(b % 2 == 1) {
            for(int i = b; i >= a; i-=2) {
                sb.append(i).append(" ");
            }
        } else {
            for(int i = b + 1; i >= a; i-=2) {
                sb.append(i).append(" ");
            }
        }


        System.out.println(sb);
    }
}