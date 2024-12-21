import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (a > c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (a > d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (a > e) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}