/**
 * Created by jc314116 on 29/09/16.
 */
import java.util.Random;
public class ST_Game {
    private int Number_of_players;

    public ST_Game(int Number_of_players){
        this.Number_of_players = Number_of_players;
    }

    //* If player is randomly selected as dealer, that player can shuffle cards
    public void Is_Dealer(){
        Random random_number = new Random();

        int dealer = random_number.nextInt(Number_of_players) + 1;
    }
}
