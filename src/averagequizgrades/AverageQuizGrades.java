/*  
* @author 6122403   
*  Title:            AverageQuizGrades 
* Semester:         COP2250 - Spring 2018
* Lecturer's Name:  Maria Charters
* Description of Program’s Functionality:
* It´s described in the attached word document. 
*/
package averagequizgrades;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AverageQuizGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        double quiz1; 
        double quiz2;
        double quiz3; 
        double quiz4; 
        double quiz5; 
        double quizSum; 
        double average; 
        
        System.out.println("What is the grade of your first Quiz?"); 
        quiz1 = keyboard.nextDouble(); 
        
        System.out.println("What is the grade of your second Quiz?");
        quiz2 = keyboard.nextDouble(); 
        
        System.out.println("What is the grade of your third Quiz?"); 
        quiz3 = keyboard.nextDouble(); 
        
        System.out.println("What is the grade of your fourth Quiz?"); 
        quiz4 = keyboard.nextDouble(); 
        
        System.out.println("What is the grade of your fifth Quiz?");
        quiz5 = keyboard.nextDouble();  
        
        quizSum = quiz1 + quiz2 + quiz3 + quiz4 + quiz5; 
        average = quizSum/5;  
        
        
        
        System.out.println( "Your grades for the quizes are: " + quiz1 +", " + 
                quiz2 + ", " + quiz3 + ", " + quiz4 + ", " + quiz5); 
        System.out.println("And the average is " + average); 
        
        
        
        
       
        
        
        
    }
    
}
