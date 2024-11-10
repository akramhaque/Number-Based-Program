import java.io.*;

public class Tribonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (isTribonacci(num)) {
            System.out.println(num + " is a Tribonacci Number");
        } else {
            System.out.println(num + " is not a Tribonacci Number");
        }
    }

    static boolean isTribonacci(int num) {
        int a = 0, b = 1, c = 1;
        while (a <= num) {
            if (a == num) return true;
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return false;
    }
}