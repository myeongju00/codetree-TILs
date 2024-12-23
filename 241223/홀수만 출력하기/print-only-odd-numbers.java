import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
            
        
        StringBuilder sb = new StringBuilder();
        
        for(int num : arr) {
            if(num % 2 == 1 && num % 3 == 0) {
                sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }
}