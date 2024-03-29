package A1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Deck {
    private static final int NUMBER_OF_CARDS_IN_DECK = 60;
    public ArrayList<ST_Card> cards;
    public ST_Deck(){
        cards = new ArrayList<ST_Card>();
        Handle_File load_file = new Handle_File();
        load_file.ST_Read_File(cards);
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
