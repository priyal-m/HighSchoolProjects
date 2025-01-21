// Priyal Mangla
// 2/17/2022
// looks for a word within another word
import java.util.*;
import java.io.*;

public class WordHunt
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("words.txt");
        Scanner fileReader = new Scanner(file);
        int x = 10; //x is the number of compound words
        int y = 10; //y is the number of simple words
        String[] compoundWords = new String[x];
        String[] simpleWords = new String[y];
        
        int a = 0;
        while(fileReader.hasNext() && a < x){
            // PUT THE WORDS FROM THE FILE INTO compoundWords array HERE
            compoundWords[a] = fileReader.nextLine();
            a++;
        }
        a = 0;
        while(fileReader.hasNext() && a < y){
            // PUT THE WORDS FROM THE FILE INTO simpleWords array HERE            
           simpleWords[a] = fileReader.nextLine();
            a++;
        }
        
        
        for(int i = 0; i < y; i++){
            System.out.print(simpleWords[i] + " - index ");
            int flag = 0;
            for(int j =0; j < x; j++){
                if(compoundWords[j].contains(simpleWords[i])){
                    System.out.print(j + ", " );
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print("null");
            }
            System.out.println("");
        }
        
        
    }
}