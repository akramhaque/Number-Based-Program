import java.io.*;

public class Harshad
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }
    }
}