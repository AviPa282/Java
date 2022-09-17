import java.util.*;
public class CToF 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter what you want to convert to, 1 for Celsius, 2 for Degree:");
        int type = num.nextInt();
        System.out.println("Enter the measurment of degrees: ");
        double degrees = num.nextDouble();
        double total;
        if (type == 1)
        {
            total = degrees*1.8 + 32;
        }
        else
        {
            total = (degrees - 32) * 0.5556;
        }
        
        System.out.println("The final degrees after conversion is: " + total);
        num.close();
        
    }
    
}
