
import java.util.Scanner;
public class NewTicTacToe {

public static void main(String[] args) {

        
        NewTicTacToe2 name = new NewTicTacToe2();
        name.printBoard();
        
        while (true)
        {
            int correctX = 0;
            while (correctX == 0)
            {
                Scanner myXTurn = new Scanner(System.in);
                System.out.print("Player X, insert where you want to play ");
                String xTurn = myXTurn.nextLine();
                if (name.getSpace(xTurn).equals(" "))   
                {
                    name.changeSpace(xTurn, "X");
                    correctX = 1;
                }
                else
                    System.out.println("That doesn't work, please try again.\n");
            }   
            System.out.println();
            name.printBoard();
            
            if (!name.letterCanWin("X") && !name.letterCanWin("O"))
                break;
            
            if (name.seeIfLetterWon("X"))
                break;
            
            int correctO = 0;
            while (correctO == 0)
            {
                Scanner myOTurn = new Scanner(System.in);
                System.out.print("Player O, insert where you want to play ");
                String oTurn = myOTurn.nextLine();
                if (name.getSpace(oTurn).equals(" "))
                {
                    name.changeSpace(oTurn, "O");
                    correctO = 1;
                }
                else
                    System.out.println("That doesnt work, please try again.\n");
            }
            System.out.println();
            name.printBoard();
            
            if (!name.letterCanWin("X") && !name.letterCanWin("O"))
                break;
            
            if (name.seeIfLetterWon("O"))
                break;
            
        }
            
        if (name.seeIfLetterWon("X"))
            System.out.print("\nCongrats to the X player, you won!");
        else if (name.seeIfLetterWon("O"))
            System.out.print("\nCongrats to the O player, you won!");
        else if (!name.letterCanWin("X") && !name.letterCanWin("O"))
            System.out.print("\nNo one can win, so it's a tie!");
        else
            System.out.println("IDK WHY THIS HAPPENED");
    }

}
