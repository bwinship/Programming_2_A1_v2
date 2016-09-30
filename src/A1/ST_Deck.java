package A1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Deck {
    private static final int NUMBER_OF_CARDS_IN_DECK = 60;
    private ArrayList<ST_Card> cards;

    // list all cards

    public ST_Deck(){
        cards = new ArrayList<ST_Card>();

        for (int i = 0; i < NUMBER_OF_CARDS_IN_DECK; i ++){
            cards.add(new ST_Card(i));
        }
    }

    public ArrayList<ST_Card> deal_cards(int Number_of_Cards){
        ArrayList<ST_Card> result = new ArrayList<ST_Card>();
        for (int i = 0; i < Number_of_Cards; i++){
            int index = new Random().nextInt(cards.size());

            ST_Card card = cards.remove(index);
            result.add(card);

        }
        return result;
    }
}
