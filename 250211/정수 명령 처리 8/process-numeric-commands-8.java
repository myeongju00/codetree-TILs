import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> arr = new LinkedList<>();

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_front")) {
                arr.addFirst(Integer.parseInt(st.nextToken()));
            } else if(str.equals("push_back")) {
                arr.addLast(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop_front")) {
                System.out.println(arr.pollFirst());
            } else if (str.equals("pop_back")) {
                System.out.println(arr.pollLast());
            } else if (str.equals("size")) {
                System.out.println(arr.size());
            } else if (str.equals("empty")) {
                System.out.println(arr.isEmpty()? 1: 0);
            } else if (str.equals("front")) {
                System.out.println(arr.peekFirst());
            } else {
                System.out.println(arr.peekLast());
            }
        }


        System.out.println();

    }

}