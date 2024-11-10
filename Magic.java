import java.io.*;

public class Magic 
{
    public static void main(String[] args) 
    throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = num;
        while (sum >= 10) 
        {
            sum = digitSum(sum);
        }

        if (sum == 1) 
        {
            System.out.println(num + " is a Magic Number");
        } 
        else 
        {
            System.out.println(num + " is not a Magic Number");
        }
    }

    static int digitSum(int n) 
    {
        int sum = 0;
        while (n > 0) 
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}