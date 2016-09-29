//* Programming_2 Assignment: By Brandon Winship, 13144404
import javax.swing.*;
import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        int user_choice = 0;
        Welcome();
        Menu();
        Menu_Choice(user_choice);
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
        int user_input = scan.nextInt();

        int pass = 1;
        while (pass ==1){
            if (user_input == 1){
                user_choice = user_input;
                pass = 0;
            }
            if (user_input == 2){
                user_choice = user_input;
                pass = 0;
            }
            else{
                System.out.print("Invalid choice! Please try again: ");
                user_input = scan.nextInt();
            }
        }
        return user_choice;
    }

    //* If player is randomly selected as dealer, that player can shuffle cards
    //public static void is_dealer(){

    //}


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
