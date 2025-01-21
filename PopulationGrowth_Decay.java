//Priyal Mangla
//September 27, 2021
//Calculate population growth and decay
import java.util.Scanner;
public class PopulationGrowth_Decay
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    //Growth
    
    System.out.println("Population Growth Model");
    
    System.out.println("Please enter the current population, the years to calculate for the projection, and the rate of growth:");
    double currentPop = input.nextDouble();
    double yearsPast = input.nextDouble();
    double growthRate = input.nextDouble();
    
    double finalPop = Math.pow(1+(growthRate/100),yearsPast) * currentPop;
    
    System.out.println("In "+yearsPast+ " years at "+ growthRate +"% growth, the population is expected to be " + Math.rint(finalPop));
    
    
    //Decay
    System.out.println("Population Decay Model");
    System.out.println("Please enter the current population, the years to calculate for the projection, and the rate of growth:");
    double currentPop2 = input.nextDouble();
    double yearsPast2 = input.nextDouble();
    double growthRate2 = input.nextDouble();
    
    double finalPop2 = Math.pow(1-(growthRate2/100),yearsPast2) * currentPop2;
    
    System.out.println("In "+yearsPast2+ " years at "+ growthRate2 +"% decline, the population is expected to be " + Math.rint(finalPop2));
    
    }
}