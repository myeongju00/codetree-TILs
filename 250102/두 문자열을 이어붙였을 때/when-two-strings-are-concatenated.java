import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();

        if((a+b).equals(b+a)) {
            sb.append("true");
        } else {
            sb.append("false");
        }
        System.out.println(sb);
    }
}