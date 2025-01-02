import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String n = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n.length(); i++) {
            if(i % 2 == 1) {
                sb.append(n.charAt(i));
            }
        }
        System.out.println(sb.reverse());
    }
}