package A1;//* Programming_2 Assignment: By Brandon Winship, 13144404
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        int user_choice = 0;
        int No_of_Players_Array[];
        Welcome();
        Menu();
        user_choice = Menu_Choice(user_choice);
        ST_Game game;
        if (user_choice == 1){
            game = New_Game();
            game.Begin_Game();
        }
        if (user_choice == 2){
            Exit();
        }
    }
    private static void Welcome(){

        System.out.println("Hey, Welcome to the Mineral Supertrumps Game!!!");
    }
    private static void Menu (){
        System.out.println("1. Play Game");
        System.out.println("2. Exit Game");
    }
    private static int Menu_Choice(int user_choice){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please make your choice: ");
        user_choice = scan.nextInt();

        int pass = 1;

        while (pass == 1) {
            switch (user_choice) {
                case 1:
                    user_choice = 1;
                    pass = 0;
                    break;
                case 2:
                    user_choice = 2;
                    pass = 0;
                    break;
                default:
                    System.out.print("Invalid choice!!! Please try again");
                    user_choice = scan.nextInt();
            }
        }
        return user_choice;
    }
    private static void Exit(){
        System.out.println("Bye, have a good day!");
    }

    private static ST_Game New_Game(){
        ST_Player[] number_of_players = Number_of_Players();
        ST_Game game = new ST_Game(number_of_players.length);
        game.Decide_Dealer(number_of_players.length);
        game.Deal_Cards();
        game.Player_Select();
        ST_Player Human_Player = game.Human_Player();
        Print_Player(Human_Player);
        //game.Begin_Game();
        return game;
    }
    private static ST_Player[] Number_of_Players(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please select number of players (min. 2, max. 5): ");
        int user_selection = scan.nextInt();
        boolean pass = false;

        while (!pass) {
            if (user_selection >1 && user_selection <6){
                pass = true;
            }
            else{
                System.out.print("Invalid Selection!! Please Try Again (min. 2, max. 5: ");
                user_selection = scan.nextInt();
            }
        }
        ST_Player[] No_of_Players_Array = new ST_Player[user_selection];
        return No_of_Players_Array;
    }
    private static void Print_Player(ST_Player Human_Player){
        System.out.println("Human Player = " + Human_Player);
    }
}
