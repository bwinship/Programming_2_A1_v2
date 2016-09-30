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


    public ST_Game(int Number_of_players){
        this.Number_of_players = Number_of_players;
        deck = new ST_Deck();
    }

    //* If player is randomly selected as dealer, that player can shuffle cards
    public void Decide_Dealer(){
        Random random_number = new Random();
        int dealer = random_number.nextInt(Number_of_players) + 1;
    }

    public void Deal_Cards(){
        players = new ST_Player[Number_of_players];
        for (int i = 0; i < Number_of_players; i++){
            players[i] = new ST_Player("Player Number" +i);
        }

        for (ST_Player player : players){
            ArrayList<ST_Card> cards = deck.deal_cards(STARTING_NUMBER_OF_CARDS);
            player.deal_cards(cards);
        }
    }
}
