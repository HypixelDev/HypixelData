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
    GAME_MASTER(3),
    ADMIN(4),
    ;

    private static final Collection<PlayerRank> VALUES = Arrays.asList(values());
    private static final Map<Byte, PlayerRank> BY_ID = VALUES.stream().collect(Collectors.toMap(PlayerRank::getId, Function.identity()));

    public static Collection<PlayerRank> getValues() {
        return VALUES;
    }

    public static Optional<PlayerRank> getById(byte id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    private final byte id;

    PlayerRank(int id) {
        this.id = (byte) id;
    }

    public byte getId() {
        return id;
    }
}
