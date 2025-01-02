import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();

        StringBuilder sb = new StringBuilder();

        char first = a.charAt(0);
        char second = a.charAt(1);

        sb.append(a.replace(second, first));

        System.out.println(sb);
    }
}