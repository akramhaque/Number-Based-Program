import java.io.*;

public class Abundant{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }

        if (sum > num) {
            System.out.println(num + " is an Abundant Number");
        } else {
            System.out.println(num + " is not an Abundant Number");
        }
    }
}