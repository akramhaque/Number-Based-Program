import java.io.*;

public class Buzz
{
    public static void main(String[] args) 
    throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (num % 7 == 0 || num % 10 == 7) 
        {
            System.out.println(num + " is a Buzz Number");
        } 
        else 
        {
            System.out.println(num + " is not a Buzz Number");
        }
    }
}