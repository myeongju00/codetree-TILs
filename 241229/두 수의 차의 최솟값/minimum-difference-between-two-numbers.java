import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 1; i < n; i++) {
            minDifference = Math.min(minDifference, arr[i] - arr[i - 1]);
        }
        
        System.out.println(minDifference);
    }
}