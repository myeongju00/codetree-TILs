import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        System.out.println(function(n));
    }

    public static int function(int n) {
        if(n == 0) return 0;
        int digit = n % 10;
        return digit * digit + function(n / 10);
    }
}