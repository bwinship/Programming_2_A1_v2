package A1;

import java.util.ArrayList;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Player {
    private ArrayList<ST_Card> cards;
    private String player_number;

    public void deal_cards(ArrayList<ST_Card> cards){
        this.cards = cards;
    }

    public ST_Player(String player_number){
        this.player_number = player_number;
    }

    public String toString(){
        return "" + player_number + "\n cards = " + cards;
    }

    //public int Player_Order(){}
}
