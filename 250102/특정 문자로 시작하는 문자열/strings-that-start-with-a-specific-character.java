import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        
        char targetChar = br.readLine().charAt(0);
        
        int count = 0;
        int totalLength = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == targetChar) {
                count++;
                totalLength += arr[i].length();
            }
        }
        
        double average = (double) totalLength / count;
        System.out.printf("%d %.2f", count, average);
    }
}