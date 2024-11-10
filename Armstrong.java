import java.io.*;

public class Armstrong {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0, temp = num, n = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}