import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] phone = br.readLine().split("-");
        
        System.out.println(phone[0] + "-" + phone[2] + "-" + phone[1]);
    }
}