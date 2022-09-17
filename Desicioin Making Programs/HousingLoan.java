import java.util.*;
public class HousingLoan 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter your yearly income: ");
        int income = num.nextInt();
        System.out.println("Enter your income group, H for high, M for middle, L for low: ");
        String group = num.nextLine();
        int total;
        if (group.equals("L"))
        {
            total = income*150/100;
        }
        else if (group.equals("M"))
        {
            total = income*200/100;
        }
        else
        {
            total = income*250/100;
        }
        System.out.println("Your final house loan will be: " + total);
        num.close();
        
    }
    
}
