import java.util.*;
public class Grades 
{

    public static void main(String[] args) 
    {

       
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = num.nextInt();
        char grade;
        if (marks >= 80)
        {
             grade = 'A';
        }
        
        else if (marks >= 70)
        {
             grade = 'B';
        }
        
        else if (marks >= 60)
        {
            grade = 'C';
        }
        
        else
        {
             grade = 'F';
        }
        
        System.out.println("Your grade in the class is: " + grade);
        
        num.close();
        
    }
    
}
