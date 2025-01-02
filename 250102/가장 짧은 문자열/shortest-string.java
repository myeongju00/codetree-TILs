import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[]arr = new String[3];
        arr[0] = br.readLine();
        arr[1] = br.readLine();
        arr[2] = br.readLine();

        int maxSize = arr[0].length();
        int minSize = arr[0].length();

        for (int i = 1; i < 3; i++) {
            maxSize = Math.max(maxSize, arr[i].length());
            minSize = Math.min(minSize, arr[i].length());
        }

        System.out.print(maxSize - minSize);
    }
}