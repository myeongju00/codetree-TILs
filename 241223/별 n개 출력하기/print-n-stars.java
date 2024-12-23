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
        
        for(int i = 0; i < n; i++) {
            sb.append("*").append("\n");
        }

        System.out.println(sb);
    }
}