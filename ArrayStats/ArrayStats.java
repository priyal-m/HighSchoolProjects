//Priyal Mangla
//January 14, 2022
//Finding statistics of numbers
import java.io.File;
import java.util.Scanner;

public class ArrayStats
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("ArrayData.txt"); //Makes a file object based on the file in parentheses
        Scanner sc = new Scanner(file); //Makes a scanner object that looks at the contents of the file object named "file"
        
        int x = 10;
        int[] arr1 = new int[x]; //x is the size of the array
        
        //This loops fills in the array with the contents of the file
        int i = 0;
        while(sc.hasNextLine()){ 
            arr1[i] = sc.nextInt();
            i++;
        }
        
        // Prints out the array using an enhanced for loop
        for(int num:arr1){
            System.out.print(num + " ");
        }
        
        //YOUR CODE HERE
        
        //max and min
        
        int max = arr1[0] ;
        int min = arr1[0];
        
        for(int h = 1 ; h <x ; h++){
            if(max< arr1[h]){
                max = arr1[h];
            }
            if(min > arr1[h]){
                min= arr1[h];
            }
        }
        System.out.println("");
        
        System.out.println("The maximum is " + max + ".");
        System.out.println("The minimum is " + min + ".");
        
        //Range
        int range = max - min;
        
        System.out.println("The range is " + range + ".");
        
        //average
        
        int sum = 0;
        
        for(int h = 0 ; h <x ; h++){
            sum += arr1[h];
        }
        int average = sum/x ; 
        
        System.out.println("The average is " + average + ".");
        
        //duplicates
        int flag = 0;
        
        for(int h = 0 ; h <x ; h++){
            for(int j = h+1; j < x; j++){
                if(arr1[h] == arr1[j]){
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            System.out.println("There is at least one duplicate.");
        }
    }
}