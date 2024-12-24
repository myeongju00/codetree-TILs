import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int count = 0;

        while (true) {
            int age = Integer.parseInt(br.readLine());
            if (age < 20 || age >= 30) {
                break;
            }
            sum += age;
            count++;
        }

        double average = (double) sum / count;
        System.out.printf("%.2f%n", average);
    }
}