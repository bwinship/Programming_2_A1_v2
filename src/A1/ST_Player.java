package A1;

import java.util.ArrayList;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Player {
    private ArrayList<ST_Card> cards;
    private String player_number;
    private int number_of_players;

    public void deal_cards(ArrayList<ST_Card> cards){
        this.cards = cards;
    }

    public ST_Player(String player_number){
        this.player_number = player_number;
    }

    public void ST_Game(int number_of_players){
        this.number_of_players = number_of_players;
    }

    public String toString(){
        String temp = "" + player_number + "\nCARDS:\n";
        for (int i = 0; i < cards.size(); i++) {
            temp += cards.get(i).toString() + "\n";
        }
        return temp;
    }
}
