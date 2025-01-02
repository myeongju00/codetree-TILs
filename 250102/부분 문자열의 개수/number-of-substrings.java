import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int index = 0;

        while ((index = a.indexOf(b, index)) != -1) {
            count++;
            index++;
        }

        System.out.println(count);
    }
}