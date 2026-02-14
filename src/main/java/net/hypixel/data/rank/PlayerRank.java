package net.hypixel.data.rank;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Optional;

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

    private static final EnumSet<PlayerRank> VALUES = EnumSet.allOf(PlayerRank.class);
    private final int id;

    PlayerRank(int id) {
        this.id = id;
    }

    public static Collection<PlayerRank> getValues() {
        return VALUES;
    }

    public static Optional<PlayerRank> getById(int id) {
        return getValues().stream()
                .filter((pr) -> pr.getId() == id)
                .findFirst();
    }

    public int getId() {
        return id;
    }
}
