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
        
        StringBuilder sb = new StringBuilder();
        
        if(a % 2 == 0) {
            for(int i = a; i <= b; i+=2) {
                sb.append(i).append(" ");
            }
        } else {
            for(int i = a + 1; i <= b; i+=2) {
                sb.append(i).append(" ");
            }
        }


        System.out.println(sb);
    }
}