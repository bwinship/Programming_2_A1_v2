//* Programming_2 Assignment: By Brandon Winship, 13144404
import javax.swing.*;
import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        int user_choice = 0;
        Welcome();
        Menu();
        user_choice = Menu_Choice(user_choice);
        if (user_choice == 1){
            New_Game();
        }
        if (user_choice == 2){
            Exit();
        }
    }

    private static void Welcome(){
        System.out.println("Hey, welcome to the Mineral Supertrumps Game!!!");
    }

    //* A player can exit game or start a new game
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

    private static void New_Game(){
        int Number_of_Players = Number_of_Players();
        ST_Game game = new ST_Game(Number_of_Players);
        game.Is_Dealer();
        Deal_Cards();
    }

    private static void Deal_Cards(){

    }

    //*Player can choose number of players
    private static int Number_of_Players(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please select number of players (min. 2, max. 5: ");
        int user_selection = scan.nextInt();

        switch (user_selection){
            case 1: user_selection = 1;
                break;
            case 2: user_selection = 2;
                break;
            case 3: user_selection = 3;
                break;
            case 4: user_selection = 4;
                break;
            case 5: user_selection = 5;
                break;
            default: System.out.print("Invalid selection, please select number of players again. (min. 2, max. 5: ");
                user_selection = scan.nextInt();
        }
        return user_selection;
    }

    //* Player can look at their cards but cannot show other players their cards
    // public static void view_player_cards(){

    //}

    //* If a player is sitting left of the dealer, player goes first
    // public static void who_goes_first(){

    //}

    //* Player can place mineral card on table, declare mineral name, one of the five playing categories and the top
    // value of that category
    // public static

    //* If it’s the player’s second turn, player can play a card but card must have a higher value in the playing
    // category than the last player


    //* Player can play a trump card, then they can follow the instructions on their card


    //* If the player does not have a higher card to play, player can pass and draw a card from the deck


    //* A player is allowed to pass even if they have a card that can be played


    //* A player can win by being the first person to lose all their cards



}
