import java.util.*;
public class TravelFare 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter travel distance:");
        int distance = num.nextInt();
        int fare = 0;
        if (distance <= 5)
        {
            fare = 100;
        }
        else if (distance <= 10)
        {
            fare = 100 + (12*(distance - 5));
        }
        else
        {
            fare = 160 + (15*(distance - 10));
        }
        System.out.println("The final fare for the whole travel is: " + fare);
        num.close();
        
    }
    
}
