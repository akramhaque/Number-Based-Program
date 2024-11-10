import java.io.*;

public class Dudeney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum * sum * sum == num) {
            System.out.println(num + " is a Dudeney Number");
        } else {
            System.out.println(num + " is not a Dudeney Number");
        }
    }
}