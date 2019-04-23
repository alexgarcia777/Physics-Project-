
/**
 * Tracks Hurricanes from x year to y year.
 *
 * @Alexander Garcia
 * @ November 4, 2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class HurricaneSelectorV2
{
    public static void main (String []args) throws IOException
    {
        // decleration of variables 
        int aveCat=0;
        int counter=0;
        int counter2=0;
        int counter3=0;
        int [] years= new int [156];
        String [] months= new String [years.length];
        int [] pressure= new int [years.length];
        int [] windspeed= new int [years.length];
        String [] nameOfHurr= new String [years.length];
        double [] mph= new double[years.length];
        int category []= new int[years.length];
        int i= 0;
        int aveCar; int maxCat= Integer.MIN_VALUE; int minCat= Integer.MAX_VALUE;int maxP= Integer.MIN_VALUE;int minP= Integer.MAX_VALUE;int pressSum= 0;
        int aveP= 0; int windSum= 0;double maxWind= Double.MIN_VALUE;double minWind= Double.MAX_VALUE; int avgWind= 0;
        int sum=0;
        int category1=0,category2=0,category3=0,category4=0,category5=0;
        Scanner in= new Scanner (System.in);

        //reading from file
        File myFile= new File ("HurricaneData.txt");
        Scanner inFile= new Scanner (myFile);

        while(inFile.hasNext() && i<156){          
            years[i]= inFile.nextInt();
            months[i]= inFile.next();
            pressure[i]= inFile.nextInt();
            windspeed[i]= inFile.nextInt();
            nameOfHurr[i]= inFile.nextLine();
            i++;
        }
        inFile.close();

        // converting knots to MPH
        for (int j=0; j<mph.length; j++){
            mph[j]= windspeed[j]*1.15078;         
        }

        // declaring MPH to different categories
        for (int j=0; j<mph.length; j++){
            if (mph[j]>= 74 && mph[j]<=95){
                category[j]= 1;
                category1++;
            }
            else if (mph[j]>=95 && mph[j]<=110){
                category[j]= 2;
                category2++;
            }
            else if (mph[j]>=111 && mph[j]<=129){
                category[j]= 3; 
                category3++;
            }
            else if (mph[j]>=130 && mph[j]<=156){
                category[j]= 4; 
                category4++;
            }
            else if (mph[j]>=156){
                category[j]= 5; 
                category5++;
            }                     
        }

        System.out.println("Choose lower value for year of Hurricanes");
        int lowerValue= in.nextInt();
        System.out.println("Choose upper value for year of Hurricanes");
        int upperValue= in.nextInt();

        System.out.printf("\t"+"%-15s%-10s%-10s%-10s%-10s%-20s%n", "Hurricane", "Years", "Month","Category", "Pressure", "Windspeed(MPH)");
        System.out.printf("%-20s%n","-----------------------------------------------------------------------------------");
        System.out.printf("%-20s%n","------------------------------------------------------------------------------------");
        for (i=0; i<years.length; i++){
            if (years[i]>= lowerValue && years[i]<= upperValue){
                System.out.printf("%-15s%-10d%-11s%-10d%-10d%-20.2f%n", nameOfHurr[i],years[i],months[i],category[i],pressure[i],mph[i]);
                //cat
                sum+= category[i];
                counter++;
                if (category[i]>maxCat){
                    maxCat=category[i];
                }
                if (category[i]<minCat){
                    minCat=category[i];                    
                }
                aveCat=sum/counter;
                //pressure
                pressSum+=pressure[i];
                counter2++;
                if (pressure[i]>maxP){
                    maxP=pressure[i];
                }
                if (pressure[i]<minP){
                    minP=pressure[i];                    
                }
                aveP= pressSum/counter2;

                //windspeed
                windSum+=mph[i];
                counter3++;
                if (mph[i]>maxWind){
                    maxWind=mph[i];
                }
                if (mph[i]<minP){
                    minWind=mph[i];
                }
                avgWind= windSum/counter3;  
                //outFile.printf("%10s%10f%10f%10f%10f%10f%n", nameOfHurr[i],years[i],months[i],pressure[i],windspeed[i],category[i]);
            }           
        }
        System.out.printf("%-20s%n","-----------------------------------------------------------------------------------");
        System.out.printf("%-20s%n","------------------------------------------------------------------------------------");
        System.out.printf("\t"+"\t"+"\t"+"%-10s%-10s%-4d%-11s%-6d%-10s%-6d%n", "", "Average:",aveCat,"Average:",aveP,"Average:",avgWind);
        System.out.printf("\t"+"\t"+"\t"+"%-10s%-10s%-4d%-11s%-6d%-10s%-6f%n","","Minimum:",minCat,"Minimum:",minP,"Minimum:",minWind);
        System.out.printf("\t"+"\t"+"\t"+"%-10s%-10s%-4d%-11s%-6d%-10s%-6f%n","","Minimum:",maxCat,"Minimum:",maxP,"Minimum:",maxWind);
        System.out.println("Category Sums:");
        System.out.println("Number of 1's: " + category1);
        System.out.println("Number of 2's: " + category2);
        System.out.println("Number of 3's: " + category3);
        System.out.println("Number of 4's: " + category4);
        System.out.println("Number of 5's: " + category5);
    }
}