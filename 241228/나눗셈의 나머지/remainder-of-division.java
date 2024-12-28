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
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] remainderCount = new int[b];
        
        while (a > 1) {
            int remainder = a % b;
            remainderCount[remainder]++;
            a = a / b;
        }

        int sumOfSquares = 0;
        for (int count : remainderCount) {
            sumOfSquares += count * count;
        }

        System.out.println(sumOfSquares);
    }
}