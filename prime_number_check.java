import java.util.Scanner; 
public class PrimeCheck
{
    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in); 
        int n ; 
        boolean flag = false; 
        
        // prompting and accpeting the value from the user
        System.out.print("Enter number: ");
        n = sc.nextInt(); 
        
        // finding for factors 
        for( int i = 2 ; i < n ; i++)
        {
            if( n % i == 0)
            {
                flag = true;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println(n + " is not a prime number");
        }
        else
        {
            System.out.println(n + " is a prime number");
        }
    }
}
