import java.io.*;

public class Pronic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        boolean isPronic = false;
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(num + " is a Pronic Number");
        } else {
            System.out.println(num + " is not a Pronic Number");
        }
    }
}