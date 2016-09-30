package A1; /**
 * Created by jc314116 on 29/09/16.
 */
import java.util.ArrayList;
import java.util.Random;
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
    public int Decide_Dealer(){
        Random random_number = new Random();
        dealer = random_number.nextInt(5)+1;
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
        int game_active = 0;
        while (game_active == 0){
            System.out.println("Dealer is: " + dealer);
            System.out.println("The order of turns goes: \n 1. " + dealer + "\n 2. " + Number_of_players);
            for (int i = 0; i < players.length; i++){

                // check human player
                game_active = 1;
            }
            //Print_Player_Turn();


        }
    }
}
