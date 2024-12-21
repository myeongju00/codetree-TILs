import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());

        if(n >= 3000) {
            System.out.println("book");
        } else if (n >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }

    }
}