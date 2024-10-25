public class fibonacciseries {
    // Recursive Method To Calculate Number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }}
    public static void main(String[] args) {
        int terms = 7; //Number Of Fibonacci Terms
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }}
