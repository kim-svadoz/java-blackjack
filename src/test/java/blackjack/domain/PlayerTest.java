package blackjack.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    public void Ace를_받았을때_합이_21을_넘을경우_1을_더해준다() {
        //given
        Player player = new Player("pobi", 15, false);

        //when
        player.receiveCard(new Card("스페이드", "A", 11, 1));

        //then
        assertThat(player.getScore()).isEqualTo(16);
    }

    @Test
    public void Ace를_받았을때_합이_21을_넘지않을경우_11을_더해준다() {
        //given
        Player player = new Player("pobi", 8, false);

        //when
        player.receiveCard(new Card("스페이드", "A", 11, 1));

        //then
        assertThat(player.getScore()).isEqualTo(19);
    }
}