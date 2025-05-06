package net.hypixel.data.rank;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum PlayerRank {
    NORMAL(1),
    YOUTUBER(2),
    STAFF(3),
    /**
     * @deprecated Replaced with the unified {@link PlayerRank#STAFF} rank.
     */
    @Deprecated
    ADMIN(4),
    ;

    private static final Collection<PlayerRank> VALUES = Arrays.asList(values());
    private static final Map<Integer, PlayerRank> BY_ID = VALUES.stream().collect(Collectors.toMap(PlayerRank::getId, Function.identity()));

    public static Collection<PlayerRank> getValues() {
        return VALUES;
    }

    public static Optional<PlayerRank> getById(int id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    private final int id;

    PlayerRank(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
