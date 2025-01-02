import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[]arr = new String[2];
        arr[0] = br.readLine();
        arr[1] = br.readLine();

        String result = "";

        for (int i = 0; i < 2; i++) {
            result += arr[i].replace(" ", "");
        }

        System.out.print(result);
    }
}