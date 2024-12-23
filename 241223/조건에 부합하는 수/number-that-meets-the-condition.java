import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= a; i++) {
            if(i % 2 != 0 || i % 4 == 0) {
                if((i / 8) % 2 != 0) {
                    if(i % 7 >= 4) {
                        sb.append(i).append(" ");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}