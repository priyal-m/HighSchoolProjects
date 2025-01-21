//Priyal Mangla
//January 26, 2020
//Practice
public class BubbleSort
{
    public static void main(String[] args)
    {
    
    int[] arr1 = {1, 3, 6, 7, 5, 2, 8, 9, 0, 4};
    
    
    int swap;
    for(int i = 0; i < 9; i++){
        for(int j=0; j < 9; j++){
            if(arr1[j] > arr1[j+1]){
                swap = arr1[j];
                arr1[j] = arr1[j+1];
                arr1[j+1] = swap;
            }
        }
    }
    
    for( int a : arr1){
        System.out.print(a + " ");
    }
        System.out.println("");
    }
}