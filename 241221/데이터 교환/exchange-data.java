public class Main {
    public static void main(String[] args) {
        int a = 5; 
        int b = 6; 
        int c = 7;
        
        int temA = a, temB = b, temC = c;

        c = temB;
        b = temA;
        a = temC;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}