package az.atlacademy.lesson172;

import java.util.Comparator;

public class ComperatorWIthGrade implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return Integer.compare(player1.score, player2.score);
    }
}
