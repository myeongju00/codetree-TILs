import java.io.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        function(n);
        System.out.println(count);
    }

    public static void function(int n) {
        if(n == 1) return;

        if(n % 2 == 0) {
            count++;
            function(n / 2);
        } else {
            count++;
            function(n / 3);
        }
    }
}