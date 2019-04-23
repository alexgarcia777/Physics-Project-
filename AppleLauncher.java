
/**
 * Write a description of class lol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppleLauncher
{
    private double [][]distance= new double[7][7];
    public AppleLauncher()
    {

    }
    
    public String toString(){
        return "Today we will be calculating the projectile range of an apple that was launched at a certain angle at a certain velocity.";        
    }

    public void calculateDistance(){
        double velocity [] = {20,25,30,35,40,45,50};
        double angle [] = {25, 30,35,50,45,50,55};
        System.out.println("MPH  25 Deg   30 Deg   35 Deg   40 Deg   45 Deg   50 Deg   55 Deg");  
        System.out.print("20");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[0], 2) * (Math.sin(2* Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("25");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[1], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("30");
        for (int i=0; i<velocity.length; i++){
            double firstRow=Math.pow(velocity[2], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("35");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[3], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("40");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[4], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("45");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[5], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();
        System.out.print("50");
        for (int i=0; i<velocity.length;i++){
            double firstRow=Math.pow(velocity[6], 2) * (Math.sin(2*Math.toRadians(angle[i])))/9.8;
            System.out.printf("%-2s%-5.1f%-2s", " ", firstRow, " ");
        }
        System.out.println();

    }    

}
