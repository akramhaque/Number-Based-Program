import java.io.*;

public class Bouncy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (isBouncy(num)) {
            System.out.println(num + " is a Bouncy Number");
        } else {
            System.out.println(num + " is not a Bouncy Number");
        }
    }

    static boolean isBouncy(int num) {
        boolean increasing = false, decreasing = false;
        int prev = num % 10;
        num /= 10;

        while (num > 0) {
            int current = num % 10;
            if (current < prev) increasing = true;
            if (current > prev) decreasing = true;
            if (increasing && decreasing) return true;
            prev = current;
            num /= 10;
        }
        return false;
    }
}