package blackjack.domain.gameplayer;

import java.util.Collections;
import java.util.List;

public class Names {

    private final List<Name> names;

    public Names(final List<Name> names) {
        this.names = names;
    }

    public List<Name> getNames() {
        return Collections.unmodifiableList(names);
    }
}