import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[10];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());

        for(int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + (2 * arr[i - 2]);
        }
        for(int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}