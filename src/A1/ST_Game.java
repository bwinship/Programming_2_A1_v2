package A1; /**
 * Created by jc314116 on 29/09/16.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ST_Game {
    public int Number_of_players;
    private int dealer;
    private ST_Player[] players;
    private ST_Deck deck;
    private static final int STARTING_NUMBER_OF_CARDS = 8;
    private int Player_Number;
    private int stack;

    public ST_Game(int Number_of_players){
        this.Number_of_players = Number_of_players;
        deck = new ST_Deck();
    }

    //* If player is randomly selected as dealer, that player can shuffle cards
    public int Decide_Dealer(int number_of_players){
        Random random_number = new Random();
        dealer = random_number.nextInt(number_of_players)+1;
        return dealer;
    }

    public void Deal_Cards(){
        players = new ST_Player[Number_of_players];
        for (int i = 0; i < Number_of_players; i++){
            players[i] = new ST_Player("Player Number " +i);
        }

        for (ST_Player player : players){
            ArrayList<ST_Card> cards = deck.deal_cards(STARTING_NUMBER_OF_CARDS);
            player.deal_cards(cards);
        }
    }

    public void Player_Select(){
        Player_Number = 1;
    }

    public ST_Player Human_Player(){
        return players[Player_Number];
    }

    public void Begin_Game(){
        boolean game_active = false;
        while (!game_active){
            System.out.println("Dealer is: " + dealer);
            System.out.println("The order of turns goes:");
            for (int i = dealer+1; i < Number_of_players+dealer+1; i++){
                if (i == Number_of_players+dealer)
                    System.out.println((i-dealer) + ". " + ((i%Number_of_players) == 0 ? Number_of_players : i%Number_of_players) + " (Dealer)");
                else
                    System.out.println((i-dealer) + ". " + ((i%Number_of_players) == 0 ? Number_of_players : i%Number_of_players));
            }
            game_active = true;
            for (int i = dealer+1; i < Number_of_players+dealer+1; i++){
                int player_number = i%Number_of_players;
                int stack = 0;
                if (player_number != 1) {
                    System.out.println("Player (Computer)'s Turn!");
                    // Play a card
                   // if (stack == 0){
                     //   Computer_Plays_Random_Card();
                   //}
                    // If No cards out, then play any random card

                    // Else if cards out
                        //  If have a card that larger then card on table, play card
                        //  Else Pass and Draw a card
                            //  If deck is empty (no cards to draw), Game Over- Draw!


                    // If No cards left (Won)
                }
                else
                {
                    // Human Player (Player number == 1)
                    // Play a card
                    // If No cards out, then allow play of any card
                    // Else if cards out
                        //  If have a card has a larger attribute then card on table, allow playing of that card
                            //declare random attribute
                        //  Else if no cards can be played Pass and Draw a card
                            // if computer has passed
                                //while continue = false
                                    //if number of players ==2
                                        //if player has had a turn
                                            //continue = true
                                    //if number of players == 3
                                        //if 1 other player player has passed
                                        //continue = true
                                    //if number of players == 4
                                        //if 2 other players have passed
                                        //continue = true
                                    //if number of players == 5
                                        //if 3 other players have passed
                                        // continue = true
                            //  If deck is empty (no cards to draw), Game Over- Draw!
                    // If No cards left in hand (Won)
                }


            //}
            //for (int i = 0; i < players.length; i++){

                // check human player

            }
            //Print_Player_Turn();


        }
    }
    /*public String Computer_Plays_Random_Card(){
        ArrayList<ST_Card> card = new ArrayList<A1.ST_Card>();
        Random random_card = new Random();
        random_card = random_card.nextInt();

    }*/
}


