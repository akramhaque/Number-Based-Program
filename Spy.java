import java.io.*;

public class Spy
{
    public static void main(String[] args) throws IOException 
{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine());

        int sum = 0, product = 1, temp = number;

        while (temp > 0) 
	{
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product) 
	{
            System.out.println(number + " is a Spy Number.");
        } 
	else 
	{
            System.out.println(number + " is not a Spy Number.");
        }
    }
}