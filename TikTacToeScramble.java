import java.util.*;

public class TikTacToeScramble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        //print(board);
        
        System.out.println("Would you like to play Tic-Tac-Toe Scramble?\n1-yes\n2-no");
        String play = input.next();
        
        while(play.equals("1")){
            playGame();
            System.out.println("Would you like to play Tic-Tac-Toe Scramble again?\n1-yes\n2-no");
            play = input.next();
        }
    }
    public static void playGame(){
        String [][] board = {
            {"---", "---", " 1 ", "---", "---"},
            {"---", " 2 ", " 3 ", " 4 ", "---"},
            {" 5 ", " 6 ", " 7 ", " 8 ", " 9 "}
        };
        
        System.out.println("-------------------------------\nPlayer 1 - O\nPlayer 2 - X\nEach player gets only 3 markers \n-------------------------------\n");
        boolean turn = true;
        int counter = 0;
        
        while(!won(board)){
            if(turn){
                if(counter<5){
                    player1Place(board);
                    turn = false;
                    counter++;
                }
                else{
                    player1Place(board);
                    remove(board);
                    turn = false;
                }
            } 
            else{
                if(counter<6){
                    player2Place(board);
                    turn = true;
                    counter++;
                }
                else{
                    player2Place(board);
                    remove(board);
                    turn = true;
                }
            }
        }
        print(board);
        if(turn){
            System.out.println("Player 2 has won!\n-------------------------------");
        }
        else{
            System.out.println("Player 1 has won!\n-------------------------------");
        }
    }
   // public static void 
    public static void remove(String[][] board){
        Scanner input = new Scanner(System.in);
        System.out.println("Which marker do you want to remove?");
        String remove = input.next();
        if(remove.equals("1"))
            board[0][2] = " 1 ";
        if(remove.equals("2"))
            board[1][1] = " 2 ";
        if(remove.equals("3"))
            board[1][2] = "3";
        if(remove.equals("4"))
            board[1][3] = " 4 ";
        if(remove.equals("5"))
            board[2][0] = " 5 ";
        if(remove.equals("6"))
            board[2][1] = " 6 ";
        if(remove.equals("7"))
            board[2][2] = " 7 ";
        if(remove.equals("8"))
            board[2][3] = " 8 ";
        if(remove.equals("9"))
            board[2][4] = " 9 ";
    }
    public static void player1Place(String[][]board){
        Scanner input = new Scanner(System.in);
        print(board);
        System.out.println("Enter the number you would like to replace with your marker");
        String place = input.next();
        if(place.equals("1"))
            board[0][2] = "1-O";
        if(place.equals("2"))
            board[1][1] = "2-O";
        if(place.equals("3"))
            board[1][2] = "3-O";
        if(place.equals("4"))
            board[1][3] = "4-O";
        if(place.equals("5"))
            board[2][0] = "5-O";
        if(place.equals("6"))
            board[2][1] = "6-O";
        if(place.equals("7"))
            board[2][2] = "7-O";
        if(place.equals("8"))
            board[2][3] = "8-O";
        if(place.equals("9"))
            board[2][4] = "9-O";
    }
    public static void player2Place(String[][]board){
        Scanner input = new Scanner(System.in);
        print(board);
        System.out.println("Enter the number you would like to replace with your marker");
        String place = input.next();
        if(place.equals("1"))
            board[0][2] = "1-X";
        if(place.equals("2"))
            board[1][1] = "2-X";
        if(place.equals("3"))
            board[1][2] = "3-X";
        if(place.equals("4"))
            board[1][3] = "4-X";
        if(place.equals("5"))
            board[2][0] = "5-X";
        if(place.equals("6"))
            board[2][1] = "6-X";
        if(place.equals("7"))
            board[2][2] = "7-X";
        if(place.equals("8"))
            board[2][3] = "8-X";
        if(place.equals("9"))
            board[2][4] = "9-X";
    }
    public static void print(String[][] board){
        for(String [] x : board){
            for(String y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
    /*public static boolean open(String position){
        if(position.equals("O"))
            return false;
        if(position.equals("X"))
            return false;
            
        return true;
    }*/
    public static boolean won(String [][] board){
        if((board[0][2].equals("1-O") && board[1][1].equals("2-O") && board[2][0].equals("5-O") )|| (board[0][2].equals("1-X") && board[1][1].equals("2-X") && board[2][0].equals("5-X")))
            return true;
        if((board[0][2].equals("1-O") && board[1][3].equals("4-O") && board[2][4].equals("9-O") )|| (board[0][2].equals("1-X") && board[1][3].equals("4-X") && board[2][4].equals("9-X")))
            return true;
        if((board[0][2].equals("1-O") && board[1][2].equals("3-O") && board[2][2].equals("7-O") )|| (board[0][2].equals("1-X") && board[1][2].equals("3-X") && board[2][2].equals("7-X")))
            return true;
        if((board[1][1].equals("2-O") && board[1][2].equals("3-O") && board[1][3].equals("4-O") )|| (board[1][1].equals("2-X") && board[1][2].equals("3-X") && board[1][3].equals("4-X")))
            return true;
        if((board[2][0].equals("5-O") && board[2][1].equals("6-O") && board[2][2].equals("7-O") )|| (board[2][0].equals("5-X") && board[2][1].equals("6-X") && board[2][2].equals("7-X")))
            return true;
        if((board[2][1].equals("6-O") && board[2][2].equals("7-O") && board[2][3].equals("8-O") )|| (board[2][1].equals("6-X") && board[2][2].equals("7-X") && board[2][3].equals("8-X")))
            return true;
        if((board[2][2].equals("7-O") && board[2][3].equals("8-O") && board[2][4].equals("9-O") )|| (board[2][2].equals("7-X") && board[2][3].equals("8-X") && board[2][4].equals("9-X")))
            return true;
            
        return false;
    }
    
}