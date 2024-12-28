import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().split(" ");
        for(int i = 1; i < 10; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num % 3 == 0) {
                sb.append(arr[i - 1]).append(" ");
                break;
            }
        }
        System.out.println(sb);
    }
}