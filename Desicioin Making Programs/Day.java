import java.util.*;
public class Day 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = num.nextInt();
        String day = "";
        switch(num1)
        {
            case 1: 
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3: 
                day = "Wednesday";
                break;
            case 4: 
                day = "Thursday";
                break;
            case 5: 
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7: 
                day = "Sunday";
                break;
            default:
                day = "INVALID STATEMENT";
                break;
        }
        System.out.println("The day is: " + day);
        num.close();
        
    }
    
}
