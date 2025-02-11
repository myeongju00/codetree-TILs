import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_back")) {
                arr.add(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            } else if (str.equals("size")) {
                System.out.println(arr.size());
            } else {
                System.out.println(arr.get(Integer.parseInt(st.nextToken()) - 1));
            }
        }


        System.out.println();

    }

}