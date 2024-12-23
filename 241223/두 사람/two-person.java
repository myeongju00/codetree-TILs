import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;

        boolean isExist = false;
        
        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String gender = st.nextToken();

            if(age >= 19 && gender.equals("M")) {
                isExist = true;
                break;
            }
        }

        if(isExist) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}