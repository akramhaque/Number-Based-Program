import java.io.*;

public class Tech
{
    public static void main(String[] args) 
    throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        String numStr = Integer.toString(num);

        if (numStr.length() % 2 != 0) 
        {
            System.out.println(num + " is not a Tech Number");
            return;
        }

        int mid = numStr.length() / 2;
        int part1 = Integer.parseInt(numStr.substring(0, mid));
        int part2 = Integer.parseInt(numStr.substring(mid));
        int sum = part1 + part2;

        if (sum * sum == num) 
        {
            System.out.println(num + " is a Tech Number");
        } 
        else 
        {
            System.out.println(num + " is not a Tech Number");
        }
    }
}