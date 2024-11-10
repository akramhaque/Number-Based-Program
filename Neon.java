import java.io.*;

public class Neon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }
    }
}