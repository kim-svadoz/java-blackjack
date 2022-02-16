package blackjack.domain;

import java.util.List;
import java.util.NoSuchElementException;

public class Player extends GamePlayer {

    private static final int BLACKJACK = 21;
    private static final String WIN = "승";
    private static final String LOSE = "패";

    public Player(String name) {
        super(name);
    }

    @Override
    public boolean isLowerThanBound() {
        //여기가 문제입니다
        return getScore() < BLACKJACK;
    }

    @Override
    public String getGameResult(List<GamePlayer> allPlayers) {
        int winnerScore = allPlayers.stream()
            .map(GamePlayer::getScore)
            .max(Integer::compareTo)
            .orElseThrow(NoSuchElementException::new);

        if(this.getScore() == winnerScore){
            return WIN;
        }
        return LOSE;
    }
}
