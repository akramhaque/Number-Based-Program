import java.io.*;

public class Duck
{
    public static void main(String[] args) 
    throws IOException 
{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        String num = br.readLine();

        if (num.contains("0") && num.charAt(0) != '0') 
       {
            System.out.println(num + " is a Duck Number");
       } 
       else 
       {
            System.out.println(num + " is not a Duck Number");
       }
    }
}