// This code was contributed by https://github.com/voyager2005

import java.util.Scanner;
public class encode 
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);
        
        //prompting user to enter a string 
        System.out.println("please enter a string");
        String s = sc.nextLine();
        
        //declaration and initialisation 
        String result = "" ; 
        
        //loop to encode the character
        for(int i = 0  ; i < s.length() ; i++ )
        {
            char ch = s.charAt(i);
            int temp = ch + 3 ; 
            if( ch == ' ')
            {
                temp = 32 ; 
            }
            else if(Character.isUpperCase(ch))
            {
                if(temp > 90)
                {
                    temp = temp - 26 ;
                }
                else if (temp < 65)
                {
                    temp = temp + 26 ;
                }
            }
            else if(Character.isLowerCase(ch))
            {
                if(temp > 122)
                {
                    temp = temp - 26 ;
                }
                else if(temp < 97 )
                {
                    temp = temp + 26 ;
                }
            }
            result = result +(char)temp;
        }
         
        //displat statement 
        System.out.println(result);
    }
}
