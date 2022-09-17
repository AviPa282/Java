import java.util.*;
public class Notes 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = num.nextInt();
        int thousands = 0;
        int fivehundreds = 0;
        int hundreds = 0;
        int fifties = 0;
        int tens = 0;
        thousands = (int)amount/1000;
        amount = amount%1000;
        fivehundreds = (int)Math.floor(amount/500);
        amount = amount%500;
        hundreds = (int)Math.floor(amount/100);
        amount = amount%100;
        fifties = (int)Math.floor(amount/50);
        amount = amount%50;
        hundreds = (int)Math.floor(amount/10);
        amount = amount%10;
        System.out.println("The amount of thousand bills are:  " + thousands + ".\n The amount of five hundred bills are: " + fivehundreds + ". The amount of hundred bills are: " + hundreds + ". The amoutn of fifties are: " + fifties + ". The amount of tens are: " + tens);
        num.close();
    }
    
    
        
    }

