package A1; /**
 * Created by jc314116 on 29/09/16.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ST_Game {
    private int Number_of_players;
    private int dealer;
    private ST_Player[] players;
    private ST_Deck deck;
    private static final int STARTING_NUMBER_OF_CARDS = 8;
    private int Player_Number;



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
    //* Player can look at their cards but cannot show other players their cards
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

            //int starting_player  = (((dealer+1)%Number_of_players) == 0 ? Number_of_players : (dealer+1)%Number_of_players);
            for (int i = dealer+1; i < Number_of_players+dealer+1; i++){
                int player_number = i%Number_of_players;
                if (player_number != 1) {
                    //Computer Player

                    // Play a card

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
                        //  If have a card that larger then card on table, allow playing of that card
                        //  Else if no cards can be played Pass and Draw a card
                            //  If deck is empty (no cards to draw), Game Over- Draw!


                    // If No cards left (Won)

                }


            }
            for (int i = 0; i < players.length; i++){

                // check human player

            }
            //Print_Player_Turn();


        }
    }
}
