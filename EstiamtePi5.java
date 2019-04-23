
/**
 * Use of darts and a a simulation to estimate Pi
 * Alexander Garcia
 * 11/10/2018
 */
import java.util.Scanner;
public class EstiamtePi5
{
    public static void print(int numTrials, double xCoordinate, double yCoordinate, double radius, double numDartsPerTrial,double piValues[])
    {
        double singlePi=0;
        for (int counter=0; counter<piValues.length; counter++){            
            double numInCircle= numInCircle(xCoordinate, yCoordinate, radius, numTrials);
            double eachEstimatedPi= estimatingPi(numInCircle, numDartsPerTrial); 
            for (int i=0; i<piValues.length;i++)
            {
                piValues[i]= eachEstimatedPi;
            }
            System.out.printf("Trial " + "[" + (counter) + "]" + ": Pi = %7.5f%n" , piValues[counter]);
            singlePi+= eachEstimatedPi;
        }   
        System.out.printf("%20s%3.6f", "Average estimation of Pi's:", singlePi/numTrials);
    }

    public static double numInCircle(double xCoordinate, double yCoordinate, double radius , int numTrials){
        int numInCircle= 0;
        double numOutCircle=0;
        for (int counter=0; counter<=numTrials; counter++){            
            xCoordinate=  Math.random()*10;
            yCoordinate = Math.random()*10;
            if ((Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2)) <= (Math.pow(radius, 2))) {
                numInCircle++;
            }
            else if ((Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2)) >= (Math.pow(radius, 2))){
                numOutCircle++;
            }
        }
        return numInCircle;
    }

    public static double estimatingPi(double numInCircle, double numDartsPerTrial){      
        //estimating Pi
        double pi=(4 * (numInCircle/ numDartsPerTrial)); 
        return pi;
    }

    public static void main (String []args)
    {
        //declaration of variables
        Scanner in= new Scanner (System.in);
        double radius= 10;    
        double xCoordinate=0.0;
        double yCoordinate=0.0;
        double singlePi=0;
        //Title of program
        System.out.println("=================================================================");
        System.out.println("    Today, we will be estimating the value of Pi using darts!    ");
        System.out.println("=================================================================");
        System.out.println();       
        //asking user information
        System.out.println("How many darts should be thrown per trial?");
        double numDartsPerTrial= in.nextDouble();
        System.out.println("How many trials should we conduct?");
        int numTrials= in.nextInt();
        double piValues[]= new double[numTrials];
        print(numTrials, xCoordinate, yCoordinate,radius,numDartsPerTrial,piValues);
    }
}
