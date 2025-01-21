import java.util.*;

public class MathTikTacToe
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to play Math Tic-Tac-Toe ?\n1-yes\n2-no");
        String play = input.next();
        
        while(play.equals("1")){
            playGame();
            System.out.println("Would you like to play Math Tic-Tac-Toe again?\n1-yes\n2-no");
            play = input.next();
        }
        
    }
    public static void playGame(){
        Scanner input = new Scanner(System.in);
        String [][] board = {
            {" 1 ", " 2 ", " 3 "},
            {" 4 ", " 5 ", " 6 "},
            {" 7 ", " 8 ", " 9 "}
        };
        boolean turn = true;
        int counter = 0;
        
        while(!won(board) && counter < 9){
            if(turn){
                printBoard(board);
                System.out.println("Player 1 can place 1B, 3B, 5B, 7B, and 9B. You cannot place a marker you already placed before.\nEnter the number you would like to place.");
                
                int markerNum = playerOneMarker(board);
                String marker = markerNum + "B"; 
                System.out.println("Enter the number where you would like to place the marker : " + marker );
                String place = input.next(); 
                placeOnBoard(board, place, marker);
                
                turn = false;
                counter++;
            }
            else{
                printBoard(board);
                System.out.println("Player 2 can place  2R, 4R, 6R, and 8R. You cannot place a marker you already placed before.\nEnter the number you would like to place.");
                int markerNum = playerTwoMarker(board);
                String marker = markerNum + "R"; 
                System.out.println("Enter the number where you would like to place the marker : " + marker );
                String place = input.next(); 
                placeOnBoard(board, place, marker);
                
                turn = true;
                counter++;
            }
        }
        
        if(!won(board)){
            printBoard(board);
            System.out.println("There is a tie! No one won and all markers are placed.\n-------------------------------");
        }
        else if(turn){
            printBoard(board);
            System.out.println("Player 2 has won!\n-------------------------------");
            
        }
        else{
            printBoard(board);
            System.out.println("Player 1 has won!\n-------------------------------");
        }
        
    }
    
    public static int playerOneMarker(String[][]board){
        Scanner input = new Scanner(System.in);
        int marker = input.nextInt();
        
        while(marker!=1 && marker!=3 && marker != 5 && marker != 7&& marker != 9){
            System.out.println("please enter valid marker");
            marker = input.nextInt();
        }
        if(repeat(marker, board)){
            System.out.println("That's already used! Pick a different one!");
            marker = playerOneMarker(board);
        }
        
        return marker;
    }
    public static boolean repeat(int marker, String[][]board){
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                //System.out.println("hi" + board[i][j]+" ");
                if(board[i][j].equals(" " + marker + "B") || board[i][j].equals(" " + marker + "R") ){
                    
                    return true;
                }
            }
        }
        return false;
    }
    public static int playerTwoMarker(String[][]board){
         Scanner input = new Scanner(System.in);
        int marker = input.nextInt();
        while(marker!=2 && marker!=4 && marker != 6 && marker != 8){
            System.out.println("please enter valid marker");
            marker = input.nextInt();
        }
        if(repeat(marker, board)){
            System.out.println("That's already used! Pick a different one!");
            marker = playerTwoMarker(board);
        }
        return marker;
    }
    public static void placeOnBoard(String[][]board, String place, String marker){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                if(board[i][j].equals(" " + place+ " ")){
                    board[i][j] = " "+ marker;
                    counter++;
                }
                
            }
        }
        if(counter == 0){
            System.out.println("Please enter valid location");
            String placeNew = input.next(); 
            placeOnBoard(board, placeNew, marker);
        }
    }
    public static boolean won(String[][]board){
        
        
        int [][]numBoard = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                if(board[i][j].charAt(2) != ' ')
                    numBoard[i][j]= Integer.valueOf(board[i][j].substring(1,2));
            }
        }
        
        
        for(int i = 0; i<3; i++){
            if(board[i][0].charAt(2) != ' ' && board[i][1].charAt(2) != ' ' && board[i][2].charAt(2) != ' ')
                if(numBoard[i][0] + numBoard[i][1] + numBoard[i][2] == 15)
                    return true;
            if(board[0][i].charAt(2) != ' ' && board[1][i].charAt(2) != ' ' && board[2][i].charAt(2) != ' ')
                if(numBoard[0][i] + numBoard[1][i] + numBoard[2][i] == 15)
                    return true;
        }
        if(board[0][0].charAt(2) != ' ' && board[1][1].charAt(2) != ' ' && board[2][2].charAt(2) != ' ')
            if(numBoard[0][0] + numBoard[1][1] + numBoard[2][2] == 15)
                return true;
        if(board[0][2].charAt(2) != ' ' && board[1][1].charAt(2) != ' ' && board[2][0].charAt(2) != ' ')
            if(numBoard[0][2] + numBoard[1][1] + numBoard[2][0] == 15)
                return true;
            
        return false;
        
        
    }
    public static void printBoard(String [][]board){
        System.out.println("\n------------------------\nBOARD:");
        for(String [] x : board){
            for(String y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------------\n");
    }
}